CREATE TABLE `photo` (
  `id` int(11) NOT NULL,
  `url` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `photo` (`id`, `url`) VALUES
(1, './img/01.png'),
(2, './img/02.png'),
(3, './img/03.png'),
(4, './img/04.png'),
(5, './img/05.png'),
(6, './img/06.png'),
(7, './img/07.png'),
(8, './img/08.png'),
(9, './img/09.png'),
(10, './img/10.png'),
(11, './img/11.png'),
(12, './img/12.png'),
(13, './img/13.png'),
(14, './img/14.png'),
(15, './img/15.png'),
(16, './img/16.png'),
(17, './img/17.png'),
(18, './img/18.png'),
(19, './img/19.png'),
(20, './img/20.png'),
(21, './img/21.png'),
(22, './img/22.png'),
(23, './img/23.png'),
(24, './img/24.png'),
(25, './img/25.png'),
(26, './img/26.png'),
(27, './img/27.png');

ALTER TABLE `photo`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `photo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
