import os
import json

from io import StringIO
from io import open
from pdfminer.converter import TextConverter
from pdfminer.layout import LAParams
from pdfminer.pdfinterp import PDFResourceManager, process_pdf

from PyPDF2 import PdfFileReader, PdfFileWriter

from openpyxl import workbook
from openpyxl import load_workbook


def setting():
    if not os.path.exists('./setting'):
        os.makedirs('./setting')
    try:
        with open("./setting/setting.json",'r') as setting_file:
            content = setting_file.read()
            setting_data = json.loads(content)
    except expression as identifier:
        pass
    else:
        pass

def get_pdf_path(folder):
    pdf_path = os.listdir(folder)
    return pdf_path

def cut_page(pdf_path):
    # 分割pdf
    cache_list = []
    if not os.path.exists('./cache'):
        os.makedirs('./cache')
    with open(pdf_path, 'rb') as pdf:
        pdf_read = PdfFileReader(pdf_path)
        pdf_counts = pdf_read.getNumPages()
        for page in range(pdf_counts):
            pdf_page = pdf_read.getPage(page)
            write_cache = PdfFileWriter()
            write_cache.addPage(pdf_page)
            file_name = './cache/cache_pdf' + str(page + 1) + '.pdf'
            with open(file_name, 'wb') as pdf_file:
                write_cache.write(pdf_file)
            cache_list.append(file_name)
    os.remove(pdf_path)
    return cache_list


def read_pdf(pdf):
    # 读取pdf
    try:
        with open(pdf, 'rb') as pdf_file:
            # resource manager
            rsrcmgr = PDFResourceManager()
            retstr = StringIO()
            laparams = LAParams()
            # device
            device = TextConverter(rsrcmgr, retstr, laparams=laparams)
            process_pdf(rsrcmgr, device, pdf_file)
            device.close()
            content = retstr.getvalue()
            retstr.close()
            # 获取所有行
            lines = str(content).split("\n")
            return lines
    finally:
        os.remove(pdf)


def write_excel(text_list, excel_path):
    # 写入Excel
    try:
        workb = load_workbook(excel_path)
    except FileNotFoundError:
        workb = workbook()
    else:
        sheet = workb.active
    sheet.append(text_list)
    workb.save(excel_path)


if __name__ == '__main__':
    my_pdf = input()
    # print(cut_page(my_pdf))
    for cache_file in cut_page(my_pdf):
        print(cache_file)
        print(read_pdf(cache_file))
    # print(c)
    # print(read_pdf(my_pdf))
