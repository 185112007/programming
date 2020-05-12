%{
     EULER YONTEMI

y(x) = y(x0) + y'(x0)*h/1!

y(n+1)=y(n)+h*df(n)

%}

%{

Ex: y'=e^(3x)-y, x0=1,y0=2

%}
close all ; clear all ; clc ;

x = [0];
y = [1];
h = 0.1;

for i=2:11
    x(i)=x(i-1)+h;
    df = exp(3*x(i-1))+3*y(i-1);
    y(i) = y(i-1) + df*h; 
end

plot(x,y,'r--');