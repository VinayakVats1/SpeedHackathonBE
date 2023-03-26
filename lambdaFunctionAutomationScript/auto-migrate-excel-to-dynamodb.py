import os
import json
import boto3
import csv
import codecs
import sys
import pandas as pd

s3_resource = boto3.resource('s3')
s3 = boto3.client('s3')
dynamodb = boto3.client('dynamodb',region_name="us-east-1")
bucket = os.environ['bucket']
key = os.environ['key']
table_name = os.environ['table']
record_list=[]


def lambda_handler(event, context):
    
    try:
        csv_file = s3.get_object(Bucket=bucket, Key=key)
        record_list=csv_file['Body'].read().decode('utf-8').split("\n")
        csv_reader_data = csv.reader(record_list, delimiter=',', quotechar="'")
        # table = dynamodb.Table(tableName)
        print (csv_reader_data)
        for row in csv_reader_data:
            CustomerId=row[0]
            Speed=row[1]
            Acceleration=row[2]
            Breaking=row[3]
            Distance=row[4]
            Time_Spent_Driving=row[5]
            
            db_data_addition= dynamodb.put_item(
                TableName=table_name,
                Item={
                    'partition_key': row['primaryid'],
                    "Customer ID":CustomerId,
                    "Speed":Speed,
                    "Acceleration":Acceleration,
                    "Breaking":Breaking,
                    "Distance":Distance,
                    "Time Spent Driving":Time_Spent_Driving
                }
                )
        
    except Exception as error:
        print(error)
        print("S3 Object could not be opened. Check environment variable.")
        

    
    