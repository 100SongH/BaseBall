import numpy as np
import matplotlib.pyplot as plt
import csv
from tkinter import *
import pandas as pd
from matplotlib import font_manager, rc
font_path = "C:/Windows/Fonts/NGULIM.TTF"
font = font_manager.FontProperties(fname=font_path).get_name()
rc('font', family=font)
colors = ['r', 'b', 'g', 'c', 'm', 'y']


def KIA():
    for i in data:
        if i[1]=='KIA':
            plt.figure()
            plt.bar(data[0][3:6], i[3:6], bottom=0, color=colors[0:3], alpha=0.3)
            plt.ylim([0, 0.5])
            plt.title(i[0], fontsize=10)
            plt.show()
            tmp="r5" + i[0] + "_1"
            plt.savefig(tmp+'.png')
            
            plt.figure()
            plt.bar(data[0][6:10], i[6:10], bottom=0, color=colors[0:4], alpha=0.3)
            plt.ylim([0, 0.5])
            plt.title(i[0], fontsize=10)
            plt.show()
            tmp="r5"+i[0]+"2"
            plt.savefig(tmp+'.png')
            
            plt.figure()
            plt.bar(data[0][10:14], i[10:14], bottom=0, color=colors[0:4], alpha=0.3)
            plt.ylim([0, 0.5])
            plt.title(i[0], fontsize=10)
            plt.show()
            tmp="r5"+i[0]+"3"
            plt.savefig(tmp+'.png')
            
            plt.figure()
            plt.bar(data[0][14:20], i[14:20], bottom=0, color=colors, alpha=0.3)
            plt.ylim([0, 0.5])
            plt.title(i[0], fontsize=10)
            plt.show()
            tmp="r5"+i[0]+"4"
            plt.savefig(tmp+'.png')
            
            plt.figure()
            plt.bar(data[0][20:22], i[20:22], bottom=0, color=colors[0:2], alpha=0.3)
            plt.ylim([0, 0.5])
            plt.title(i[0], fontsize=10)
            plt.show()
            tmp="r5"+i[0]+"5"
            plt.savefig(tmp+'.png')
            
            
def Q1(): 
    #분산과 타율 관계
    
    plt.figure()
    xs = [] #타율
    for i in range(1, 79):
        xs.append(data[i][2])
    ys = [] # 분산
    for i in range(1, 79):
        ys.append(data[i][22])
    plt.scatter(xs, ys, color=colors[0:1], alpha=0.3)
    plt.xlabel('타율')
    plt.ylabel('분산*100')
    plt.title('타율-분산')
    
    #z=np.polyfit(xs, ys, 1)
    #p = np.poly1d(z)
    #plt.plot(xs, p(xs), 'r-')
    plt.show()
    
def Q2():
    # 위기상황과 타율 관계
    plt.figure()
    xs = [] # 위기상황
    for i in range(1, 79):
        xs.append((data[i][9]+data[i][8])/2)
    ys = [] # 타율
    for i in range(1, 79):
        ys.append(data[i][2])
        
    plt.scatter(xs, ys, color=colors[1:2], alpha=0.3)
    plt.xlabel('1OUT+주자있음, 2OUT+주자있음의 평균 타율')
    plt.ylabel('타율')
    plt.title('Q2')
    z=np.polyfit(xs, ys, 1)
    p = np.poly1d(z)
    plt.plot(xs, p(xs), 'r-')
    plt.show()
    
    
    
if __name__ == '__main__':
    data = list()
    f = open("average.csv", 'r', encoding='utf-8')
    tmp = csv.reader(f)
    
    for row in tmp:
        data.append(row)

    for y in range(2, 23):
        for x in range(1, 79):
            data[x][y]=float(data[x][y])
    
    KIA()
    Q1()
    Q2()
    
    

    
    