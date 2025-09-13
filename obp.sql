-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 01, 2024 at 05:01 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `obp`
--

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`id`, `name`, `description`) VALUES
(1, 'halo', '123\r\n');

-- --------------------------------------------------------

--
-- Table structure for table `department_seq`
--

CREATE TABLE `department_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `department_seq`
--

INSERT INTO `department_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `guru`
--

CREATE TABLE `guru` (
  `idGuru` int(10) NOT NULL,
  `namaGuru` varchar(50) NOT NULL,
  `pelajaran` varchar(255) DEFAULT NULL,
  `nama_guru` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `id` int(11) NOT NULL,
  `nik` varchar(255) DEFAULT NULL,
  `firstname` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `id_department` int(11) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `karyawan_seq`
--

CREATE TABLE `karyawan_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `karyawan_seq`
--

INSERT INTO `karyawan_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `loginguru`
--

CREATE TABLE `loginguru` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `loginguru`
--

INSERT INTO `loginguru` (`id`, `username`, `password`) VALUES
(0, 'felicia', '12345678');

-- --------------------------------------------------------

--
-- Table structure for table `loginguru_seq`
--

CREATE TABLE `loginguru_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `loginguru_seq`
--

INSERT INTO `loginguru_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `loginsiswa`
--

CREATE TABLE `loginsiswa` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `loginsiswa`
--

INSERT INTO `loginsiswa` (`id`, `username`, `password`) VALUES
(0, 'lavisya', '12345678');

-- --------------------------------------------------------

--
-- Table structure for table `loginsiswa_seq`
--

CREATE TABLE `loginsiswa_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `loginsiswa_seq`
--

INSERT INTO `loginsiswa_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `nilai`
--

CREATE TABLE `nilai` (
  `nisn` int(11) NOT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `kelas` int(11) DEFAULT NULL,
  `semester` varchar(255) NOT NULL,
  `pelajaran` varchar(255) NOT NULL,
  `nilai` int(11) DEFAULT NULL,
  `id_guru` int(11) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `nilai`
--

INSERT INTO `nilai` (`nisn`, `nama`, `kelas`, `semester`, `pelajaran`, `nilai`, `id_guru`, `username`) VALUES
(1, 'Lavisya', NULL, '1', 'Matematika', 80, 1, NULL),
(2, 'Lavisya', NULL, '2', 'Bahasa Inggris', 85, 1, NULL),
(3, 'Lavisya', NULL, '1', 'IPA', 70, 1, NULL),
(4, 'Lavisya', NULL, '2', 'IPS', 90, 1, NULL),
(5, 'Lavisya', NULL, '2', 'Bahasa Inggris', 80, 1, NULL),
(6, 'Rachel', NULL, '1', 'IPA', 80, 1, NULL),
(7, 'Felicia', NULL, '1', 'Matematika', 100, 1, NULL),
(8, 'Lavisya', NULL, '1', 'Agama', 80, 1, NULL),
(9, 'Lavisya', NULL, '2', 'Seni', 80, 1, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `nilai1`
--

CREATE TABLE `nilai1` (
  `nisn` int(11) NOT NULL,
  `id_guru` int(11) DEFAULT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `nilai` int(11) DEFAULT NULL,
  `pelajaran` varchar(255) DEFAULT NULL,
  `semester` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `prestasi`
--

CREATE TABLE `prestasi` (
  `nisn` int(11) NOT NULL,
  `jenis` varchar(255) NOT NULL,
  `tingkat` varchar(255) NOT NULL,
  `peringkat` int(10) NOT NULL,
  `deskripsi` varchar(255) NOT NULL,
  `tahun` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `prestasi`
--

INSERT INTO `prestasi` (`nisn`, `jenis`, `tingkat`, `peringkat`, `deskripsi`, `tahun`) VALUES
(1, 'Non-Akademik', 'Nasional', 2, 'Lomba Masak', 2021),
(2, 'Akademik', 'Kota', 1, 'Lomba Debat', 2021),
(3, 'Non-Akademik', 'Internasional', 1, 'Lomba puisi', 2022),
(4, 'Non-Akademik', 'Sekolah', 2, 'Olimpiade Matematika', 2024),
(5, 'Non-Akademik', 'Internasional', 3, 'Lomba Nyanyi', 2025);

-- --------------------------------------------------------

--
-- Table structure for table `siswa`
--

CREATE TABLE `siswa` (
  `nisn` int(15) NOT NULL,
  `nama` varchar(120) NOT NULL,
  `kelas` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `password`) VALUES
('felicia', '12345678');

-- --------------------------------------------------------

--
-- Table structure for table `username`
--

CREATE TABLE `username` (
  `username` varchar(20) NOT NULL,
  `password` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `username`
--

INSERT INTO `username` (`username`, `password`) VALUES
('felicia', '12345678'),
('lavisya', '12345678');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `guru`
--
ALTER TABLE `guru`
  ADD PRIMARY KEY (`idGuru`);

--
-- Indexes for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `nik` (`nik`),
  ADD KEY `id_department` (`id_department`);

--
-- Indexes for table `loginguru`
--
ALTER TABLE `loginguru`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `loginsiswa`
--
ALTER TABLE `loginsiswa`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `nilai`
--
ALTER TABLE `nilai`
  ADD PRIMARY KEY (`nisn`);

--
-- Indexes for table `nilai1`
--
ALTER TABLE `nilai1`
  ADD PRIMARY KEY (`nisn`);

--
-- Indexes for table `prestasi`
--
ALTER TABLE `prestasi`
  ADD PRIMARY KEY (`nisn`);

--
-- Indexes for table `siswa`
--
ALTER TABLE `siswa`
  ADD PRIMARY KEY (`nisn`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `department`
--
ALTER TABLE `department`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `karyawan`
--
ALTER TABLE `karyawan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `nilai`
--
ALTER TABLE `nilai`
  MODIFY `nisn` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `nilai1`
--
ALTER TABLE `nilai1`
  MODIFY `nisn` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `prestasi`
--
ALTER TABLE `prestasi`
  MODIFY `nisn` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD CONSTRAINT `karyawan_ibfk_1` FOREIGN KEY (`id_department`) REFERENCES `department` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
