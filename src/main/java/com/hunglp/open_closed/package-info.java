package com.hunglp.open_closed;

/*

[RULE]:
- Được phép mở rộng 1 class/interface
- Không được thay đổi logic class/interface cũ


[bad]:
- Ko tối ưu vì : Khi thêm một Operation mới, ví dụ: division, mod, multiplication
- Thì phải định nghĩa thêm Operation, và sửa thêm hàm calculate() ở class Calculator
- Vi phạm nguyên tắc: vì mở rộng tính năng nhưng lại update logic code ở class Calculator


[good]:
- Đã đảm bảo nguyên tắc
- Mở rộng chức năng : Division
- Mà không làm thay đổi logic của Class Calculator
*/