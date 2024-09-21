package com.hunglp.interface_segregation;

/*
[RULE]: - Chia interface to thành nhiều interface nhỏ hơn

[bad]
 - Tất cả các hàm đặt đơn online/offline, thanh toán online/offline đều để chung một Interface
-> Giả sử có class OnlineCustomer, thì dẫn đến ko support đặt đơn offline, thanh toán offline

[good]
-> Việc chia nhỏ thành hai interface : OrderInterface, PaymentInterface là tối ưu hơn

*/