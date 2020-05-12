clc; clear all; close all;

A = [4 -2 1; 2 3 -1; 8 -5 2]

% i - satir, j - sutun
n=size(A,1);
U=A;
L=eye(n);

for i=1:n-1
    for j=i+1:n
        L(j,i) = U(j,i)/U(i,i);
        U(j,:) = U(j,:)-(U(i,:)*U(j,i))/U(i,i);
    end
end
L
U


