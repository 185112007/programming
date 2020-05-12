% Close all figures, clear variables in memory and MATLAB command screen
close all; clear all; clc;

% Set the output format to the short format with compact line spacing
format short; format compact;

% Specify values and necessary parameters
x = [0 2 3 5 8];
y = [-6 0 7 21 65];

A = [length(x) sum(x) sum(x.^2); 
    sum(x) sum(x.^2) sum(x.^3);
    sum(x.^2) sum(x.^3) sum(x.^4)];
b = [sum(y); sum(y.*x); sum(y.*(x.^2))];

a = inv(A)*b;
%a = polyfit(x,y,2);

gx = a(1) + a(2)*x + a(3)*(x.^2);

plot(x, y, 'k-o', x, gx, 'r-*');
legend('fx', 'gx');