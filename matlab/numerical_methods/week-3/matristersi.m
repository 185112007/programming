% 1 katsayýlar matrisini gir
clc; clear all; close all;

A = [1 0 2;2 1 0; 3 2 1];

b = [-9; 5; 4];
% veya b = [-9 5 4]' transpozunu almak

x=inv(A)*b;
x