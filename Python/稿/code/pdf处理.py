import os,json
from openpyxl import workbook
from openpyxl import load_workbook

# import openpyxl

def write_excel(text_list,excel_path):
    try:
        workb =  load_workbook(excel_path)
    except FileNotFoundError:
        workb = workbook()
    else:
        sheet = workb.active
    sheet.append(text_list)
    workb.save(excel_path)

def setting():
    if not os.path.exists('./setting'):
        os.makedirs('./setting')
    try:
        with open("./setting/setting.json",'r') as setting_file:
            content = setting_file.read()
            setting_data = json.loads(content)
    except FileNotFoundError:
        with open("./setting/setting.json",'w') as setting_file:
            
    else:
        pass

# write_excel([111,222,1212],'ceshi.xlsx')