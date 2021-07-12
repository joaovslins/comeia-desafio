-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 12-Jul-2021 às 12:30
-- Versão do servidor: 10.4.14-MariaDB
-- versão do PHP: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `comeia`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente_entity`
--

CREATE TABLE `cliente_entity` (
  `id` int(11) NOT NULL,
  `cep` varchar(255) DEFAULT NULL,
  `rua` varchar(255) DEFAULT NULL,
  `bairro` varchar(255) DEFAULT NULL,
  `cidade` varchar(255) DEFAULT NULL,
  `complemento` varchar(255) DEFAULT NULL,
  `cpfoucnpj` varchar(255) DEFAULT NULL,
  `data_cadastro` timestamp NOT NULL DEFAULT current_timestamp(),
  `nome` varchar(255) DEFAULT NULL,
  `numero` varchar(255) DEFAULT NULL,
  `telefone` varchar(255) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  `uf` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `cliente_entity`
--

INSERT INTO `cliente_entity` (`id`, `cep`, `rua`, `bairro`, `cidade`, `complemento`, `cpfoucnpj`, `data_cadastro`, `nome`, `numero`, `telefone`, `tipo`, `uf`) VALUES
(7, '55000-000', 'rua duque', 'centro', 'Caruaru', 'sem complemento', '132.343.123-34', '2021-07-10 10:00:33', 'João', '102', '8134324-0413', 'Cliente PF', 'PE');

-- --------------------------------------------------------

--
-- Estrutura da tabela `conta_entity`
--

CREATE TABLE `conta_entity` (
  `id` int(11) NOT NULL,
  `agencia` int(11) DEFAULT NULL,
  `data_cadastro` timestamp NOT NULL DEFAULT current_timestamp(),
  `id_titular` int(11) DEFAULT NULL,
  `nome_titular` varchar(255) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  `saldo` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `conta_entity`
--

INSERT INTO `conta_entity` (`id`, `agencia`, `data_cadastro`, `id_titular`, `nome_titular`, `numero`, `saldo`) VALUES
(23, 10, '2021-07-11 08:20:59', 7, 'joao', 234, 100);

-- --------------------------------------------------------

--
-- Estrutura da tabela `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(25);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `cliente_entity`
--
ALTER TABLE `cliente_entity`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `conta_entity`
--
ALTER TABLE `conta_entity`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
