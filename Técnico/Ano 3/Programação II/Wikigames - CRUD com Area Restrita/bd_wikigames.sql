-- phpMyAdmin SQL Dump
-- version 4.9.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 25-Jun-2023 às 11:59
-- Versão do servidor: 5.7.36
-- versão do PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bd_wikigames`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_jogo`
--

DROP TABLE IF EXISTS `tb_jogo`;
CREATE TABLE IF NOT EXISTS `tb_jogo` (
  `codigo` varchar(45) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `data_lancamento` date NOT NULL,
  `plataforma` varchar(1000) NOT NULL,
  `desenvolvedora` varchar(200) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tb_jogo`
--

INSERT INTO `tb_jogo` (`codigo`, `nome`, `data_lancamento`, `plataforma`, `desenvolvedora`) VALUES
('CBBF6EFC-4059-4254-B225-96738FFF9C9A', 'Far Cry 3', '2012-02-14', ' PlayStation 4, PlayStation 3,  Xbox One, Xbox 360, Microsoft Windows', 'Ubisoft'),
('8E6CD482-7E0E-488D-83D0-CC721107EBCD', 'Red Dead Redemption 2', '3333-03-31', 'PlayStation 4, PlayStation 5, Nintendo Switch, Xbox One, Microsoft Windows, Xbox Series X e Series S, Mac OS', 'Unknown Worlds Entertainment');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_personagem`
--

DROP TABLE IF EXISTS `tb_personagem`;
CREATE TABLE IF NOT EXISTS `tb_personagem` (
  `codigo` varchar(45) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `altura` float NOT NULL,
  `peso` float NOT NULL,
  `nome_franquia` varchar(255) NOT NULL,
  `genero` varchar(9) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tb_personagem`
--

INSERT INTO `tb_personagem` (`codigo`, `nome`, `altura`, `peso`, `nome_franquia`, `genero`) VALUES
('60039594-FA19-4969-916F-B610F23F7B6C', 'Leon Scott Kenedy', 1.8, 52, 'Resident Evil', 'Masculino');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_usuario`
--

DROP TABLE IF EXISTS `tb_usuario`;
CREATE TABLE IF NOT EXISTS `tb_usuario` (
  `id` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `salt` varchar(45) NOT NULL,
  `hash_senha` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tb_usuario`
--

INSERT INTO `tb_usuario` (`id`, `email`, `salt`, `hash_senha`) VALUES
('DEAC5873-D41C-4CF1-8C89-D29AFE8E9939', 'adulerviana@gmail.com', '5DFA33A7-1451-40A6-86F8-BFFE6BEBE4C8', '5DgyyLjogVtnA'),
('67EF9962-6941-413E-A3EC-B86B849CBDC9', 'alaulf@protonmail.com', 'B412352B-EE0D-4DE8-8CC3-590D5C68F963', 'B4yxPLgmU6Pec'),
('661F6199-F85C-49EE-BDAF-0C0356503ECA', 'adulerviana@gmail.com', 'A3DEAA4B-F34E-4960-8808-F6B7C5070636', 'A3v0ZLRfCPzyI');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
