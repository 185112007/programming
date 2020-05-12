% en kucuk kareler yontemi(egri uydurma)
clc; clear all; close all;

x = [0 1 2 4 7];
y = [1 4 7 13 22];


% for ile
sum = 0;
for i=1:length(y)
   sum = sum + y(i); 
end
%

fx = sum/length(y);

plot(x,y,'k', x, fx,'r-*');