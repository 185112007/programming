%{
     TAYLOR SERISI YONTEMI

y(x1) = y(x0) + y'(x0)(x1-x0)/1! + y''(x0)(x1-x0)^2/2!
              + y'''(x0)(x1-x0)^3/3! + ...

%}

%{

Ex: y'=x-y, x0=1,y0=2

%}
close all ; clear all ; clc ;

x = [0];
y = [1];
h = 0.1;

for i=2:11
    x(i)=x(i-1)+h;
    df = exp(3*x(i-1))+3*y(i-1);
    dff = 3*exp(3*x(i-1))+3*df;
    dfff = 9*exp(3*x(i-1))+3*dff;
    y(i) = y(i-1) + df*(x(i)-x(i-1))/1 + dff*(x(i)-x(i-1))^2/2 + dfff*(x(i)-x(i-1))^3/(3*2); 
end

plot(x,y,'r--');