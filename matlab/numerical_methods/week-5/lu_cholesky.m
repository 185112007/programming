clc; clear all; close all;

% 1. Create matrix A and B

a = [4 10 8; 10 26 26; 8 26 61]
b = [44;128;214]

% 2. find L(lower matrix) and LT(transpose of lower matrix)

t = a; % copy a matrix
n=size(a,1);
for k = 1 : n
    for i = 1 : k-1
        sum = 0;
        for j = 1 : i-1
            sum = sum + t(i,j) * t(k,j);
        end
        t(k, i) = (t(k, i) - sum)/t(i, i);
    end
    sum = 0;
    for j = 1 : k -1
        sum = sum + t(k,j)^2;
    end
    t(k,k) = (t(k,k) - sum)^.5;
end

L=tril(t)
Lt = L'

% 3. lower*y = b ==> find y = ?
y = zeros(n,1);

for i = 1:n
    sum = 0;
    for j = 1:n
        if i ~= j
            sum = sum + (L(i,j) * y(j));
        end
    end
    y(i) = (b(i) - sum) / L(i,i);
end

y

% 4. lowerT*x = y ==> find x = ?
x = zeros(n,1);

for i = n:-1:1
    sum = 0;
    for j = 1:n
        if i ~= j
            sum = sum + (Lt(i,j) * x(j));
        end
    end
    x(i) = (y(i) - sum) / Lt(i,i);
end

x
