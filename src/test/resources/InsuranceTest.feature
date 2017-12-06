#language: ru
Функционал: Страхование

  Сценарий: Заявка на ДМС

  Когда выбран пункт меню "Страхование"
  И выбран вид страхования "ДМС"

  Тогда заголовок страницы - ДМС равен "Добровольное медицинское страхование"

  Когда выполнено нажати на кнопку Отправить заявку
  Тогда заголовок страницы - Заявка на ДМС равен "Заявка на добровольное медицинское страхование"

  Когда заполняются поля:
    |Имя|Иван|
    |Фамилия|Иванов|
    |Отчество|Иванович|
    |Регион|Москва|
    |Телефон|9191111111|
    |Эл. почта|teststststs|
    |Дата контакта|10.10.2017|
    |Комментарии|Autotest|

  Тогда значения полей равны:
    |Имя|Иван|
    |Фамилия|Иванов|
    |Отчество|Иванович|
    |Регион|Москва|
    |Телефон|+7 (919) 111-11-11|
    |Эл. почта|teststststs|
    |Комментарии|Autotest|

  И в поле "Эл. почта" присутствует сообщение об ошибке "Введите адрес электронной почты"