use Library


insert into bookType values('���')

select *
from bookType

insert into book values('123456','ios','�廪��ѧ','2015-01-01',86,10,'2016-08-08','����','���',0,'��ѧ�߱ر�')

select *
from book

select *
from auther

select *
from book,bookType,auther
where book.auId = auther.auId and book.typeId = bookType.typeId

select *
from reader

select *
from admin







