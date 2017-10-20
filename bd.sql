-- phpMyAdmin SQL Dump
-- version 4.4.1.1
-- http://www.phpmyadmin.net
--
-- Host: localhost:8889
-- Generation Time: Oct 20, 2017 at 11:57 AM
-- Server version: 5.5.42
-- PHP Version: 5.6.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `sgbd-cc`
--

-- --------------------------------------------------------

--
-- Table structure for table `Agenda`
--

CREATE TABLE `Agenda` (
  `date` date NOT NULL,
  `periode` tinyint(4) NOT NULL,
  `idVisite` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Analyse`
--

CREATE TABLE `Analyse` (
  `nomAnalyse` varchar(255) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Analyse`
--

INSERT INTO `Analyse` (`nomAnalyse`, `id`) VALUES
('Urine', 1),
('Sang', 2);

-- --------------------------------------------------------

--
-- Table structure for table `CartePaiement`
--

CREATE TABLE `CartePaiement` (
  `rib` int(11) NOT NULL,
  `idUser` int(11) NOT NULL,
  `idPaiement` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Medecin`
--

CREATE TABLE `Medecin` (
  `numeroSecu` int(11) NOT NULL,
  `salaire` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Utilisateurs`
--

CREATE TABLE `Utilisateurs` (
  `idUser` int(11) NOT NULL,
  `numeroSecu` int(11) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Utilisateurs`
--

INSERT INTO `Utilisateurs` (`idUser`, `numeroSecu`, `nom`, `prenom`) VALUES
(1, 21607739, 'MAESTRACCI', 'DAMIEN'),
(2, 21506969, 'PONCEAU', 'NATHANAEL');

-- --------------------------------------------------------

--
-- Table structure for table `Visite`
--

CREATE TABLE `Visite` (
  `idVisite` int(11) NOT NULL,
  `numeroSecu` int(11) NOT NULL,
  `idMed` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `paid` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Analyse`
--
ALTER TABLE `Analyse`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `CartePaiement`
--
ALTER TABLE `CartePaiement`
  ADD PRIMARY KEY (`idPaiement`);

--
-- Indexes for table `Medecin`
--
ALTER TABLE `Medecin`
  ADD PRIMARY KEY (`numeroSecu`);

--
-- Indexes for table `Utilisateurs`
--
ALTER TABLE `Utilisateurs`
  ADD PRIMARY KEY (`idUser`);

--
-- Indexes for table `Visite`
--
ALTER TABLE `Visite`
  ADD PRIMARY KEY (`idVisite`);