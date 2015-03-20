CREATE TABLE `t_ar` (
`bid` int(10) UNSIGNED NOT NULL,
`ar_pic` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`ar_mov` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
PRIMARY KEY (`bid`, `ar_pic`) 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci;

CREATE TABLE `t_best_book` (
`bid` int(10) UNSIGNED NOT NULL,
`reson` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
PRIMARY KEY (`bid`) 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci;

CREATE TABLE `t_book` (
`bid` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
`bname` char(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`bauthor` char(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`brate` float UNSIGNED NOT NULL DEFAULT 0,
`category` char(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`book_face` char(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
PRIMARY KEY (`bid`) 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1;

CREATE TABLE `t_collect` (
`uid` int(10) UNSIGNED NOT NULL,
`bid` int(255) UNSIGNED NOT NULL,
PRIMARY KEY (`uid`, `bid`) ,
INDEX `fk_t_collect_t_book_1` (`bid`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci;

CREATE TABLE `t_history` (
`uid` int(10) UNSIGNED NOT NULL,
`bid` int(10) UNSIGNED NOT NULL,
`last_read_time` datetime NOT NULL,
PRIMARY KEY (`uid`, `bid`) ,
INDEX `fk_t_history_t_book_1` (`bid`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci;

CREATE TABLE `t_hot_book` (
`bid` int(10) UNSIGNED NOT NULL,
PRIMARY KEY (`bid`) 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci;

CREATE TABLE `t_new_book` (
`bid` int(10) UNSIGNED NOT NULL,
PRIMARY KEY (`bid`) 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci;

CREATE TABLE `t_user` (
`uid` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
`uname` char(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`upasswd` char(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
`unickname` char(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
`uhead` char(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
`ugender` char(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
`usignature` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
`upower` tinyint(4) NOT NULL,
PRIMARY KEY (`uid`) 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1;


ALTER TABLE `t_ar` ADD CONSTRAINT `fk_t_ar_book_1` FOREIGN KEY (`bid`) REFERENCES `t_book` (`bid`) on delete cascade;
ALTER TABLE `t_best_book` ADD CONSTRAINT `fk_Table 1_t_book_1` FOREIGN KEY (`bid`) REFERENCES `t_book` (`bid`) on delete cascade;
ALTER TABLE `t_collect` ADD CONSTRAINT `fk_t_collect_t_book_1` FOREIGN KEY (`bid`) REFERENCES `t_book` (`bid`) on delete cascade;
ALTER TABLE `t_collect` ADD CONSTRAINT `fk_t_collect_t_user_1` FOREIGN KEY (`uid`) REFERENCES `t_user` (`uid`) on delete cascade;
ALTER TABLE `t_history` ADD CONSTRAINT `fk_t_history_t_book_1` FOREIGN KEY (`bid`) REFERENCES `t_book` (`bid`) on delete cascade;
ALTER TABLE `t_history` ADD CONSTRAINT `fk_t_history_t_user_1` FOREIGN KEY (`uid`) REFERENCES `t_user` (`uid`) on delete cascade;
ALTER TABLE `t_hot_book` ADD CONSTRAINT `fk_t_hot_book_t_book_1` FOREIGN KEY (`bid`) REFERENCES `t_book` (`bid`) on delete cascade;
ALTER TABLE `t_new_book` ADD CONSTRAINT `fk_t_new_book_book_1` FOREIGN KEY (`bid`) REFERENCES `t_book` (`bid`) on delete cascade;
ALTER TABLE `t_user` ADD CONSTRAINT `UNQ_t_user` UNIQE (`uname`);
