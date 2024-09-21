package com.hunglp.liskov_subtitution;

/*
[RULE]:
- Class con phải code sao cho có thể thay thế/đảm nhiệm các chức năng của class cha

[bad] :
 - Vi phạm nguyên tắc Liskov subsitution ở class ElectricCar
 - ElectricCar là lớp con nhưng không thể đảm nhiệm chức năng đã khai báo ở lớp cha là Car

[good]:
- ElectricCar ko cần phải định nghĩa phương thức khởi động động cơ, ko phải ném Exception
- PetrolCar vẫn đảm bảo được phương thức khởi động động cơ

=>  Đã áp dụng nguyên tắc Liskov: Lớp con đã đảm nhiệm được chức năng khai báo ở lớp cha
*/