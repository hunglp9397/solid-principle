package com.hunglp.dependency_inversion;

/*
[RULE]:
  Module cha và con nên phụ thuộc vào nhau thông qua abstract Class hoặc Interface

[bad]
    Parent mặc định phụ thuộc vào Child, Khi muốn thay đổi hành vi của child là khó, có thể phải xóa đi

[good]
    Child có nhiều cách thay đổi hành vi
    Parent tùy chọn muốn sử dụng hành vi nào của Child
*/