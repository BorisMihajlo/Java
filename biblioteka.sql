-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 01, 2019 at 12:26 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `biblioteka`
--

-- --------------------------------------------------------

--
-- Table structure for table `bibliotekar`
--

CREATE TABLE `bibliotekar` (
  `id` int(5) NOT NULL,
  `ime` varchar(30) NOT NULL,
  `prezime` varchar(30) NOT NULL,
  `adresa` varchar(40) NOT NULL,
  `telefon` varchar(15) NOT NULL,
  `datum_rodjenja` varchar(10) NOT NULL,
  `email` varchar(30) NOT NULL,
  `datum_zaposlenja` varchar(10) NOT NULL,
  `admin` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `clanarina`
--

CREATE TABLE `clanarina` (
  `redni_broj` int(5) NOT NULL,
  `id_korisnika` int(5) NOT NULL,
  `cena` float NOT NULL,
  `datum_otvaranja` varchar(10) NOT NULL,
  `datum_isticanja` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `knjiga`
--

CREATE TABLE `knjiga` (
  `id_knjige` int(5) NOT NULL,
  `naziv` varchar(100) NOT NULL,
  `barkod` varchar(30) NOT NULL,
  `ISBN_broj` int(15) NOT NULL,
  `autor` varchar(100) NOT NULL,
  `sadrzaj` varchar(500) NOT NULL,
  `kategorija` varchar(30) NOT NULL,
  `izdavac` varchar(30) NOT NULL,
  `izdanje` varchar(10) NOT NULL,
  `godina_izdavanja` int(4) NOT NULL,
  `stanje` int(5) NOT NULL,
  `broj_dostupnih_knjiga` int(5) NOT NULL,
  `broj_izdatih_knjiga` int(5) NOT NULL,
  `poklon` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `knjiga`
--

INSERT INTO `knjiga` (`id_knjige`, `naziv`, `barkod`, `ISBN_broj`, `autor`, `sadrzaj`, `kategorija`, `izdavac`, `izdanje`, `godina_izdavanja`, `stanje`, `broj_dostupnih_knjiga`, `broj_izdatih_knjiga`, `poklon`) VALUES
(1, 'Senka vetra ', 'bar41374', 343525, 'Karlos Ruis Safon', '...', 'misterija, avantura', 'Dobra knjiga', 'drugo', 2010, 1, 1, 0, 0),
(2, 'Igra andjela', 'bar634923', 34235, 'Karlos Ruis Safon', '...', 'misterija, avantura', 'Dobra knjiga', 'drugo', 2010, 1, 1, 0, 0),
(3, 'Lavirint duhova', 'bar6358423', 445365745, 'Karlos Ruis Safon', '......', 'misterija, avantura', 'Dobra knjiga', 'prvo', 2016, 1, 1, 0, 1),
(4, 'Marina', 'bar934265', 325463, 'Karlos Ruis Safon', '....', 'misterija, avantura', 'Dobra knjiga', 'peto', 2005, 1, 1, 0, 1);

-- --------------------------------------------------------

--
-- Table structure for table `knjigakorisnik`
--

CREATE TABLE `knjigakorisnik` (
  `id_korisnika` int(5) NOT NULL,
  `barkod` varchar(30) NOT NULL,
  `datum_izdavanja` varchar(10) NOT NULL,
  `rok_vracanja` varchar(20) NOT NULL,
  `datum_vracanja` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `korisnik`
--

CREATE TABLE `korisnik` (
  `id_korisnika` int(5) NOT NULL,
  `ime` varchar(30) NOT NULL,
  `prezime` varchar(30) NOT NULL,
  `adresa` varchar(40) NOT NULL,
  `datum_rodjenja` varchar(10) NOT NULL,
  `broj_telefona` varchar(15) NOT NULL,
  `clanarina` tinyint(1) NOT NULL,
  `broj_clanske_karte` int(5) NOT NULL,
  `tip` varchar(10) NOT NULL,
  `broj_pozajmljenih_knjiga` int(5) NOT NULL,
  `max_broj_knjiga` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bibliotekar`
--
ALTER TABLE `bibliotekar`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `clanarina`
--
ALTER TABLE `clanarina`
  ADD PRIMARY KEY (`id_korisnika`),
  ADD UNIQUE KEY `UNIQUE` (`redni_broj`);

--
-- Indexes for table `knjiga`
--
ALTER TABLE `knjiga`
  ADD PRIMARY KEY (`id_knjige`),
  ADD UNIQUE KEY `barkod` (`barkod`);

--
-- Indexes for table `knjigakorisnik`
--
ALTER TABLE `knjigakorisnik`
  ADD PRIMARY KEY (`id_korisnika`),
  ADD UNIQUE KEY `broj_izdatih_knjiga` (`barkod`);

--
-- Indexes for table `korisnik`
--
ALTER TABLE `korisnik`
  ADD PRIMARY KEY (`id_korisnika`),
  ADD UNIQUE KEY `broj_clanske_karte` (`broj_clanske_karte`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bibliotekar`
--
ALTER TABLE `bibliotekar`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `knjiga`
--
ALTER TABLE `knjiga`
  MODIFY `id_knjige` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `knjigakorisnik`
--
ALTER TABLE `knjigakorisnik`
  MODIFY `id_korisnika` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `korisnik`
--
ALTER TABLE `korisnik`
  MODIFY `id_korisnika` int(5) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `clanarina`
--
ALTER TABLE `clanarina`
  ADD CONSTRAINT `clanarina_ibfk_1` FOREIGN KEY (`id_korisnika`) REFERENCES `korisnik` (`id_korisnika`);

--
-- Constraints for table `knjigakorisnik`
--
ALTER TABLE `knjigakorisnik`
  ADD CONSTRAINT `knjigakorisnik_ibfk_1` FOREIGN KEY (`barkod`) REFERENCES `knjiga` (`barkod`),
  ADD CONSTRAINT `knjigakorisnik_ibfk_2` FOREIGN KEY (`id_korisnika`) REFERENCES `korisnik` (`id_korisnika`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
