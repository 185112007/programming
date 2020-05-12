%{
     REDUCED EULER YONTEMI

y(n+1)=y(n)+h*(df(n)+df(n+1))/2

%}

%{

Ex1: y'=x-y, x0=1,y0=2
    df = x-y

Ex2: y'=e^(3x)-y, x0=1,y0=2
    df = exp(3*x(i-1))+3*y(i-1);

%}
close all ; clear all ; clc ;

x = [1];
y = [2];
h = 0.2;

for i=2:10
    
    x(i)=x(i-1)+h;
    
    %df = x(i-1)-y(i-1);% ex1
    df = exp(3*x(i-1))+3*y(i-1);% ex2
    
    tmpy = y(i-1) + df*h/2;
    
    %dff = x(i)-tmpy;% ex1
    dff = exp(3*x(i))+3*tmpy;% ex2
    
    y(i)= y(i-1) + h*(df+dff)/2;
end
x
y

plot(x,y,'r--');