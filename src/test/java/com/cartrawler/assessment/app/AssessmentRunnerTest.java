package com.cartrawler.assessment.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class AssessmentRunnerTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void testRunMethodOutput() {
        // When
        AssessmentRunner.main(null);

        // Then
        String output = outContent.toString();
        assertTrue(output.contains("Input Size : 309"));
        assertTrue(output.contains("Output Size : 191"));
        assertCarResultsContain(output);
    }

    private void assertCarResultsContain(String output) {
        assertTrue(output.contains("CENTAURO : Volkswagen Polo : EDMR : 11.38 : FULLEMPTY"));
        assertTrue(output.contains("CENTAURO : Citroen Berlingo : CMMV : 34.11 : FULLEMPTY"));
        assertTrue(output.contains("ENTERPRISE : Citroen Berlingo : CMMV : 212.23 : FULLFULL"));
        assertTrue(output.contains("THRIFTY : Peugeot 107 : MCMR : 67.03 : FULLFULL"));
        assertTrue(output.contains("CENTAURO : Peugeot 107 : MCMR : 9.78 : FULLEMPTY"));
        assertTrue(output.contains("SIXT : BMW 2 Series Active Tourer : JDAR : 239.18 : FULLFULL"));
        assertTrue(output.contains("CENTAURO : Ford Focus Estate : CWMR : 59.12 : FULLEMPTY"));
        assertTrue(output.contains("GOLDCAR : Toyota Avensis : IDAR : 116.68 : FULLEMPTY"));
        assertTrue(output.contains("FIREFLY : Peugeot 107 : MCMR : 26.57 : FULLEMPTY"));
        assertTrue(output.contains("CENTAURO : Nissan Juke Diesel : HFMD : 35.31 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : Mercedes Vito Traveliner : SVMR : 108.04 : FULLEMPTY"));
        assertTrue(output.contains("CENTAURO : Peugeot 107 : MCMR : 9.53 : FULLEMPTY"));
        assertTrue(output.contains("GOLDCAR : Volkswagen Touran : IVMR : 366.84 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : Volkswagen Up : MDMR : 4.0 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : Volkswagen Golf : CDMR : 8.05 : FULLEMPTY"));
        assertTrue(output.contains("CENTAURO : Volkswagen Touran Diesel : IVMD : 80.43 : FULLEMPTY"));
        assertTrue(output.contains("BUDGET : Toyota Avensis : IDMR : 211.89 : FULLFULL"));
        assertTrue(output.contains("FLIZZR : Citroen C3 Picasso : EMMV : 75.93 : FULLEMPTY"));
        assertTrue(output.contains("CENTAURO : Mercedes Vito Traveliner : SVMR : 168.59 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : Renault Clio Estate : EWMR : 10.93 : FULLEMPTY"));
        assertTrue(output.contains("FLIZZR : Opel Corsa : EBMN : 56.51 : FULLFULL"));
        assertTrue(output.contains("GOLDCAR : Renault Scenic : JGMR : 139.95 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : Volkswagen Touran : IVMR : 35.64 : FULLEMPTY"));
        assertTrue(output.contains("RECORD : Ford Galaxy : FVAR : 160.75 : FULLEMPTY"));
        assertTrue(output.contains("NIZA : Volkswagen Up : MDMR : 18.6 : FULLFULL"));
        assertTrue(output.contains("GOLDCAR : Toyota Avensis : IDMR : 301.95 : FULLEMPTY"));
        assertTrue(output.contains("SIXT : Peugeot 107 : MCMR : 97.08 : FULLFULL"));
        assertTrue(output.contains("CENTAURO : Volkswagen Touran Diesel : IVMD : 82.8 : FULLEMPTY"));
        assertTrue(output.contains("AVIS : Volkswagen Polo : EDMR : 160.73 : FULLFULL"));
        assertTrue(output.contains("CENTAURO : Peugeot 107 : MCMR : 40.82 : FULLFULL"));
        assertTrue(output.contains("MARBESOL : Ford Galaxy : FVMR : 45.07 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : Volkswagen Polo : EDMM : 4.8 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : Toyota Avensis : IDMR : 36.57 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : Toyota Yaris : EDAR : 16.86 : FULLEMPTY"));
        assertTrue(output.contains("CENTAURO : Ford Focus Estate Diesel : CWMD : 67.26 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : Citroen Berlingo : CMMV : 10.53 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : Volkswagen Passat : SDAR : 44.14 : FULLEMPTY"));
        assertTrue(output.contains("FLIZZR : Volkswagen Golf : CDMR : 87.91 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : Volkswagen Golf Diesel : CDMD : 8.86 : FULLEMPTY"));
        assertTrue(output.contains("GOLDCAR : BMW 3 Series : FDAR : 436.43 : FULLEMPTY"));
        assertTrue(output.contains("DELPASO : Volkswagen Polo : EDMR : 6.23 : FULLEMPTY"));
        assertTrue(output.contains("NIZA : Volkswagen Touran Diesel : IVMD : 55.47 : FULLEMPTY"));
        assertTrue(output.contains("SIXT : Renault Scenic : JGMR : 245.09 : FULLFULL"));
        assertTrue(output.contains("GOLDCAR : Nissan Juke : CFMR : 146.54 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : BMW 4 Series Convertible : RTAV : 189.85 : FULLEMPTY"));
        assertTrue(output.contains("SIXT : Volkswagen Golf : CDMR : 134.45 : FULLFULL"));
        assertTrue(output.contains("SIXT : Citroen C4 Cactus : CGAR : 191.54 : FULLFULL"));
        assertTrue(output.contains("HERTZ : Peugeot 107 : MCMR : 67.98 : FULLFULL"));
        assertTrue(output.contains("MARBESOL : BMW 3 Series : FDMR : 47.55 : FULLEMPTY"));
        assertTrue(output.contains("NIZA : Volkswagen Golf : CDMR : 33.06 : FULLFULL"));
        assertTrue(output.contains("MARBESOL : Ford Focus Estate : CWMR : 16.11 : FULLEMPTY"));
        assertTrue(output.contains("FLIZZR : Citroen C1 : MBMR : 42.54 : FULLEMPTY"));
        assertTrue(output.contains("BUDGET : Toyota Avensis : IDMR : 211.89 : FULLFULL"));
        assertTrue(output.contains("BUDGET : Opel Astra : CCMR : 177.15 : FULLFULL"));
        assertTrue(output.contains("MARBESOL : Volkswagen Polo : EDMM : 4.8 : FULLEMPTY"));
        assertTrue(output.contains("GOLDCAR : Mercedes Vito Traveliner : SVMR : 621.7 : FULLEMPTY"));
        assertTrue(output.contains("CENTAURO : Ford C-Max Diesel : CMMD : 71.23 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : Renault Megane Convertible : CTMR : 59.22 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : Volkswagen Golf Diesel : CDMD : 8.86 : FULLEMPTY"));
        assertTrue(output.contains("ENTERPRISE : Toyota Avensis : IDMR : 124.84 : FULLFULL"));
        assertTrue(output.contains("ENTERPRISE : Renault Scenic : IMMR : 224.74 : FULLFULL"));
        assertTrue(output.contains("MARBESOL : Volkswagen Up : MDMR : 4.0 : FULLEMPTY"));
        assertTrue(output.contains("BUDGET : Opel Astra : CCMR : 177.15 : FULLFULL"));
        assertTrue(output.contains("BUDGET : Toyota Avensis : IDMR : 211.89 : FULLFULL"));
        assertTrue(output.contains("THRIFTY : Peugeot 107 : MCMR : 67.03 : FULLFULL"));
        assertTrue(output.contains("CENTAURO : Volkswagen Golf : CDMR : 26.96 : FULLEMPTY"));
        assertTrue(output.contains("CENTAURO : Ford Focus Estate : CWMR : 60.86 : FULLEMPTY"));
        assertTrue(output.contains("FIREFLY : Volkswagen Polo : EDMR : 29.79 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : Volkswagen Polo : EDMR : 4.49 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : BMW 3 Series : FDAR : 74.03 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : Volkswagen Golf : CDMR : 8.05 : FULLEMPTY"));
        assertTrue(output.contains("CENTAURO : Volkswagen Polo : EDMR : 42.41 : FULLFULL"));
        assertTrue(output.contains("CENTAURO : Ford Focus Estate Diesel : CWMD : 69.24 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : Ford Fiesta Diesel : EDMD : 5.11 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : Volkswagen Golf : CDAR : 25.24 : FULLEMPTY"));
        assertTrue(output.contains("GOLDCAR : Volkswagen Golf : CDMR : 39.79 : FULLEMPTY"));
        assertTrue(output.contains("RECORD : Ford Galaxy : FVMR : 154.59 : FULLEMPTY"));
        assertTrue(output.contains("NIZA : Volkswagen Polo : EDMR : 12.81 : FULLEMPTY"));
        assertTrue(output.contains("CENTAURO : Citroen Berlingo : CMMV : 65.15 : FULLFULL"));
        assertTrue(output.contains("RECORD : Volkswagen Golf : CDMR : 26.52 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : Volkswagen Golf : CDAR : 25.24 : FULLEMPTY"));
        assertTrue(output.contains("CENTAURO : Ford Galaxy Diesel : FVMD : 148.23 : FULLEMPTY"));
        assertTrue(output.contains("FLIZZR : Citroen DS3 : ESMR : 61.44 : FULLFULL"));
        assertTrue(output.contains("DELPASO : Toyota Rav4 : IFMR : 41.16 : FULLEMPTY"));
        assertTrue(output.contains("CENTAURO : Volkswagen Touran : IVMR : 72.29 : FULLEMPTY"));
        assertTrue(output.contains("CENTAURO : Volkswagen Golf : CDMR : 58.77 : FULLFULL"));
        assertTrue(output.contains("GOLDCAR : Volkswagen Golf : CDMR : 49.58 : FULLFULL"));
        assertTrue(output.contains("BUDGET : Opel Astra : CCMR : 196.21 : FULLFULL"));
        assertTrue(output.contains("SIXT : BMW 3 Series : FDMR : 225.18 : FULLFULL"));
        assertTrue(output.contains("NIZA : Mini Cooper : EDMR : 16.75 : FULLEMPTY"));
        assertTrue(output.contains("CENTAURO : Ford Fiesta Diesel : EDMD : 25.02 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : BMW 4 Series Convertible : RTAV : 189.85 : FULLEMPTY"));
        assertTrue(output.contains("GOLDCAR : Ford Focus Estate : CWMR : 126.08 : FULLEMPTY"));
        assertTrue(output.contains("GOLDCAR : Citroen DS3 : ESMR : 63.69 : FULLEMPTY"));
        assertTrue(output.contains("NIZA : Audi A3 Diesel : CDMD : 41.16 : FULLEMPTY"));
        assertTrue(output.contains("AVIS : Peugeot 107 : MCMR : 145.52 : FULLFULL"));
        assertTrue(output.contains("CENTAURO : Volkswagen Touran : IVMR : 74.42 : FULLEMPTY"));
        assertTrue(output.contains("SIXT : Volkswagen Polo : EDMR : 128.93 : FULLFULL"));
        assertTrue(output.contains("RECORD : Citroen Berlingo : CMMV : 33.26 : FULLEMPTY"));
        assertTrue(output.contains("SIXT : Mini Convertible : NTMR : 248.85 : FULLFULL"));
        assertTrue(output.contains("SIXT : Smart Fortwo : MUMR : 115.76 : FULLFULL"));
        assertTrue(output.contains("MARBESOL : Renault Megane Convertible : CTMR : 59.22 : FULLEMPTY"));
        assertTrue(output.contains("ENTERPRISE : Volkswagen Golf : CDMR : 142.05 : FULLFULL"));
        assertTrue(output.contains("MARBESOL : Nissan Qashqai : IFMR : 45.07 : FULLEMPTY"));
        assertTrue(output.contains("NIZA : Renault Scenic Diesel : JGAD : 93.67 : FULLEMPTY"));
        assertTrue(output.contains("DELPASO : Ford Focus Estate : CWMR : 31.35 : FULLEMPTY"));
        assertTrue(output.contains("SIXT : Ford Focus Estate : CWMR : 222.56 : FULLFULL"));
        assertTrue(output.contains("NIZA : Volkswagen Golf : CDMR : 18.07 : FULLEMPTY"));
        assertTrue(output.contains("NIZA : Volkswagen Polo : EDMR : 22.65 : FULLFULL"));
        assertTrue(output.contains("GOLDCAR : Peugeot 107 : MCMR : 39.63 : FULLFULL"));
        assertTrue(output.contains("RECORD : Citroen Berlingo : CMMV : 34.8 : FULLEMPTY"));
        assertTrue(output.contains("CENTAURO : Nissan Juke Diesel : HFMD : 34.32 : FULLEMPTY"));
        assertTrue(output.contains("CENTAURO : Ford C-Max Diesel : CMMD : 69.2 : FULLEMPTY"));
        assertTrue(output.contains("GOLDCAR : Citroen Berlingo : CMMV : 53.89 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : Volkswagen Passat : SDAR : 44.14 : FULLEMPTY"));
        assertTrue(output.contains("CENTAURO : Volkswagen Golf Diesel : CDMD : 40.91 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : Nissan Qashqai : IFMR : 45.07 : FULLEMPTY"));
        assertTrue(output.contains("NIZA : Ford C-Max Diesel : CMMD : 43.98 : FULLFULL"));
        assertTrue(output.contains("CENTAURO : Citroen Berlingo : CMMV : 33.15 : FULLEMPTY"));
        assertTrue(output.contains("FLIZZR : Toyota Rav4 : IFMR : 75.93 : FULLEMPTY"));
        assertTrue(output.contains("CENTAURO : Nissan Juke Diesel : HFMD : 66.35 : FULLFULL"));
        assertTrue(output.contains("FLIZZR : Citroen C1 : MBMR : 49.08 : FULLFULL"));
        assertTrue(output.contains("FIREFLY : Volkswagen Touran : IVMR : 125.92 : FULLEMPTY"));
        assertTrue(output.contains("DELPASO : Volkswagen Up : MDMR : 5.92 : FULLEMPTY"));
        assertTrue(output.contains("ENTERPRISE : Volkswagen Polo : EDMR : 105.51 : FULLFULL"));
        assertTrue(output.contains("FLIZZR : Citroen DS3 : ESMR : 53.56 : FULLEMPTY"));
        assertTrue(output.contains("AVIS : Opel Astra : CCMR : 203.32 : FULLFULL"));
        assertTrue(output.contains("MARBESOL : Volkswagen Passat Diesel : IDMD : 38.15 : FULLEMPTY"));
        assertTrue(output.contains("DELPASO : Mercedes Vito Traveliner : SVMR : 121.26 : FULLEMPTY"));
        assertTrue(output.contains("AVIS : Peugeot 107 : MCMR : 145.52 : FULLFULL"));
        assertTrue(output.contains("NIZA : Mini Cooper : EDMR : 36.92 : FULLFULL"));
        assertTrue(output.contains("MARBESOL : Renault Clio Estate : EWMR : 10.93 : FULLEMPTY"));
        assertTrue(output.contains("FLIZZR : Volkswagen Polo : EDMR : 56.51 : FULLFULL"));
        assertTrue(output.contains("CENTAURO : Ford Fiesta Diesel : EDMD : 56.77 : FULLFULL"));
        assertTrue(output.contains("BUDGET : Opel Astra : CCMR : 177.15 : FULLFULL"));
        assertTrue(output.contains("CENTAURO : Ford Fiesta Diesel : EDMD : 25.74 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : Volkswagen Passat Diesel : IDMD : 38.15 : FULLEMPTY"));
        assertTrue(output.contains("FIREFLY : Renault Clio Estate : EWMR : 45.16 : FULLEMPTY"));
        assertTrue(output.contains("SIXT : Opel Corsa : ECMN : 107.58 : FULLFULL"));
        assertTrue(output.contains("SIXT : Audi A3 : ICMR : 186.37 : FULLFULL"));
        assertTrue(output.contains("BUDGET : Toyota Avensis : IDMR : 234.91 : FULLFULL"));
        assertTrue(output.contains("MARBESOL : Toyota Yaris : EDAR : 16.86 : FULLEMPTY"));
        assertTrue(output.contains("BUDGET : Opel Astra : CCMR : 177.15 : FULLFULL"));
        assertTrue(output.contains("GOLDCAR : Audi A3 : ICMR : 84.46 : FULLEMPTY"));
        assertTrue(output.contains("CENTAURO : Volkswagen Polo : EDMR : 11.08 : FULLEMPTY"));
        assertTrue(output.contains("RECORD : Nissan Juke : CFMR : 28.64 : FULLEMPTY"));
        assertTrue(output.contains("GOLDCAR : Volkswagen Polo : EDMR : 44.99 : FULLFULL"));
        assertTrue(output.contains("CENTAURO : Volkswagen Touran : IVAR : 99.8 : FULLEMPTY"));
        assertTrue(output.contains("NIZA : Audi A3 Diesel : CDMD : 63.07 : FULLFULL"));
        assertTrue(output.contains("MARBESOL : Mercedes Citan : CMMD : 10.53 : FULLEMPTY"));
        assertTrue(output.contains("FLIZZR : Opel Corsa : EBMN : 49.29 : FULLEMPTY"));
        assertTrue(output.contains("GOLDCAR : Citroen DS3 : ESMR : 60.0 : FULLFULL"));
        assertTrue(output.contains("MARBESOL : Ford Galaxy : FVMR : 45.07 : FULLEMPTY"));
        assertTrue(output.contains("CENTAURO : Volkswagen Touran : IVAR : 102.75 : FULLEMPTY"));
        assertTrue(output.contains("RECORD : Peugeot 107 : MCMR : 19.1 : FULLEMPTY"));
        assertTrue(output.contains("RECORD : Toyota Rav4 : IFMR : 36.3 : FULLEMPTY"));
        assertTrue(output.contains("ENTERPRISE : Peugeot 107 : MCMR : 78.1 : FULLFULL"));
        assertTrue(output.contains("GOLDCAR : Volkswagen Golf : CLMR : 54.13 : FULLFULL"));
        assertTrue(output.contains("MARBESOL : BMW 3 Series : FDMR : 47.55 : FULLEMPTY"));
        assertTrue(output.contains("BUDGET : Toyota Avensis : IDMR : 211.89 : FULLFULL"));
        assertTrue(output.contains("FLIZZR : Volkswagen Polo : EDMR : 49.29 : FULLEMPTY"));
        assertTrue(output.contains("AVIS : Opel Astra : CCMR : 203.32 : FULLFULL"));
        assertTrue(output.contains("MARBESOL : Toyota Avensis : IDMR : 36.57 : FULLEMPTY"));
        assertTrue(output.contains("CENTAURO : Volkswagen Golf Diesel : CDMD : 42.1 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : Mercedes Vito Traveliner : SVMR : 108.04 : FULLEMPTY"));
        assertTrue(output.contains("GOLDCAR : Peugeot 107 : MCMR : 26.86 : FULLEMPTY"));
        assertTrue(output.contains("FIREFLY : Citroen Berlingo : CMMV : 35.67 : FULLEMPTY"));
        assertTrue(output.contains("DELPASO : Peugeot 107 : MCMR : 5.92 : FULLEMPTY"));
        assertTrue(output.contains("SIXT : BMW 2 Series Active Tourer : JDMR : 183.14 : FULLFULL"));
        assertTrue(output.contains("NIZA : Ford C-Max Diesel : CMMD : 22.04 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : Ford Fiesta Diesel : EDMD : 5.11 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : Volkswagen Touran : IVMR : 35.64 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : Mercedes Citan : CMMD : 10.53 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : BMW 3 Series : FDAR : 74.03 : FULLEMPTY"));
        assertTrue(output.contains("DELPASO : Volkswagen Golf : CDMR : 11.49 : FULLEMPTY"));
        assertTrue(output.contains("FIREFLY : Volkswagen Golf : CDMR : 33.84 : FULLEMPTY"));
        assertTrue(output.contains("CENTAURO : Volkswagen Golf : CDMR : 27.73 : FULLEMPTY"));
        assertTrue(output.contains("NIZA : Volkswagen Up : MDMR : 9.78 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : Ford Focus Estate : CWMR : 16.11 : FULLEMPTY"));
        assertTrue(output.contains("FLIZZR : Peugeot 2008 : EGMR : 78.43 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : Citroen Berlingo : CMMV : 10.53 : FULLEMPTY"));
        assertTrue(output.contains("CENTAURO : Mercedes Vito Traveliner : SVMR : 163.73 : FULLEMPTY"));
        assertTrue(output.contains("ENTERPRISE : Volkswagen Passat : SDMR : 206.5 : FULLFULL"));
        assertTrue(output.contains("HERTZ : Peugeot 107 : MCMR : 60.34 : FULLFULL"));
        assertTrue(output.contains("GOLDCAR : Citroen C4 Grand Picasso : IVAR : 399.28 : FULLEMPTY"));
        assertTrue(output.contains("GOLDCAR : Volkswagen Polo : EDMR : 31.71 : FULLEMPTY"));
        assertTrue(output.contains("MARBESOL : Volkswagen Polo : EDMR : 4.49 : FULLEMPTY"));
        assertTrue(output.contains("GOLDCAR : Volkswagen Golf : CLMR : 52.02 : FULLEMPTY"));
        assertTrue(output.contains("AVIS : Volkswagen Polo : EDMR : 160.73 : FULLFULL"));
        assertTrue(output.contains("RECORD : Volkswagen Polo : EDMR : 22.23 : FULLEMPTY"));
        assertTrue(output.contains("CENTAURO : Ford Galaxy Diesel : FVMD : 152.63 : FULLEMPTY"));
    }
}