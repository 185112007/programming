clc; clear all; close all;

A = [1 2 1; 2 -1 1; 3 3 -2]
b = [8 3 3]'
n = length(b);
Ab = [A b]

for sut=1:n
    for sat=1:n
        if sut~=sat
            Ab(sat,:) = (-Ab(sat,sut)/Ab(sut,sut))*Ab(sut,:)+Ab(sat,:);
        end
    end
end

Ab

for sat=1:length(b)
   x(sat,1) = Ab(sat,end)/Ab(sat,sat)
end