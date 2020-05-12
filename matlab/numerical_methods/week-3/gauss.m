clc; clear all; close all;

% 1. x degerleri yalniz biirakilir

A = [1 0 2; 2 1 0; 3 2 1]
b = [-9 5 4]'

Ab = [A b]

for sut=1:length(b)
    for sat=sut:length(b)
        Ab(sat,:) = Ab(sat,:)/Ab(sat,sut);
    end

    for i=sut+1:length(b)
        Ab(i,:) = Ab(i,:)-Ab(sut,:);
    end
end

Ab

% odev, x matrisini bulmak gerekiyor?
for sut=length(b):-1:1
    for sat=sut-1:-1:1
        Ab(sat,:) = Ab(sat,:)-Ab(sut,:)*Ab(sat,sut);
    end
end
Ab
X = Ab(:,length(b)+1)


