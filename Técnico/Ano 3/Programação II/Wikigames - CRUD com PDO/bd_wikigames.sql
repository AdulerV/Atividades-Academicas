-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: 04-Maio-2023 às 17:19
-- Versão do servidor: 5.7.23
-- versão do PHP: 5.6.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bd_wikigames`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_jogo`
--

DROP TABLE IF EXISTS `tb_jogo`;
CREATE TABLE IF NOT EXISTS `tb_jogo` (
  `codigo` int(11) NOT NULL,
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
(1, 'Assassin\'s Creed II', '2009-11-17', ' PlayStation 4, PlayStation 3, Nintendo Switch, Xbox One, Xbox 360 , PC', 'Ubisoft'),
(2, 'Red Dead Redemstion 2', '2018-10-26', 'Playstation 4, Xbox One , PC', 'Rockstar'),
(3, 'Crusader kings II', '2012-02-14', 'PC', 'Paradox'),
(4, 'Fifa 23', '2022-09-27', ' PlayStation 5, PlayStation 4, Xbox One, Xbox Series X e Series S, Nintendo Switch, Google Stadia, PC', 'EA Sports');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_personagem`
--

DROP TABLE IF EXISTS `tb_personagem`;
CREATE TABLE IF NOT EXISTS `tb_personagem` (
  `codigo` int(11) NOT NULL,
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
(1, 'Leon Scott Kennedy', 1.78, 75, 'Resident Evil', 'Masculino'),
(2, 'Claire Redfield', 1.69, 52, 'Resident Evil', 'Feminino'),
(3, 'Kratos', 1.98, 129, 'God of War ', 'Masculino'),
(4, 'Ezio Auditore da Firenze', 1.83, 77, 'Assassin´s Creed ', 'Masculino'),
(5, 'Albert Wesker', 1.83, 84.5, 'Resident Evil', 'Masculino');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
