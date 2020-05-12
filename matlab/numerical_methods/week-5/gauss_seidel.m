clc; clear all; close all;

A = [4 1 1 0; 1 4 0 1; 1 0 4 1; 0 1 1 4];
b = [1;2;0;1];
n = size(A,1);

xold = [0;0;0;0];

tol = 0.00001; % tol = 1e-4;
diff = 1;
iter = 0;
while diff>tol
    xnew = xold; % jacobiden farký
    for i=1:n
        sum = 0;
        for j = 1:n
              if i~=j
                  sum = sum + A(i,j)*xnew(j,1) % jacobiden farký
              end
        end
        xnew(i,1) = (b(i,1)-sum)/A(i,i)
    end
    
    diff = max(abs(xnew-xold))
    xold = xnew;
    iter = iter + 1;
end
xnew
iter