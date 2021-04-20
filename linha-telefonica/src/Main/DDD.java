/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author RGrupos
 */
public class DDD {
    private int[] result = {
                11,
                12,
                13,
                14,
                15,
                16,
                17,
                18,
                19,
                21,
                22,
                24,
                27,
                28,
                31,
                32,
                33,
                34,
                35,
                37,
                38,
                41,
                42,
                43,
                44,
                45,
                46,
                47,
                48,
                49,
                51,
                53,
                54,
                55,
                61,
                62,
                63,
                64,
                65,
                66,
                67,
                68,
                69,
                71,
                73,
                74,
                75,
                77,
                79,
                81,
                82,
                83,
                84,
                85,
                86,
                87,
                88,
                89,
                91,
                92,
                93,
                94,
                95,
                96,
                97,
                98,
                99
    };
        public void DDD(){
            Coordinates[] dddGeo = new Coordinates[100];
            
            //DDDs
            dddGeo[11] = new Coordinates(-23.547778,-46.635833);
            dddGeo[12] = new Coordinates(-23.203416,-45.890627);

//	}; // | São Paulo | São José dos Campos e Região.
//	dddGeo[13] = {
//	    latitude: -23.960833,
//	    longitude: -46.333889
//	}; // | São Paulo | Região Metropolitana da Baixada Santista.
//	dddGeo[14] = {
//	    latitude: -23.55052,
//	    longitude: -46.633309
//	}; // | São Paulo | Bauru, Jaú, Marília, Botucatu e Região.
//	dddGeo[15] = {
//	    latitude: -23.497741,
//	    longitude: -47.457983
//	}; // | São Paulo | Sorocaba e Região.
//	dddGeo[16] = {
//	    latitude: -21.170401,
//	    longitude: -47.810324
//	}; // | São Paulo | Ribeirão Preto, São Carlos, Araraquara e Região.
//	dddGeo[17] = {
//	    latitude: -20.800433,
//	    longitude: -49.365853
//	}; // | São Paulo | São José do Rio Preto e Região.
//	dddGeo[18] = {
//	    latitude: -23.55052,
//	    longitude: -46.633309
//	}; // | São Paulo | Presidente Prudente, Araçatuba e Região.
//	dddGeo[19] = {
//	    latitude: -22.905833,
//	    longitude: -47.060833
//	}; // | São Paulo | Região Metropolitana de Campinas.
//	dddGeo[22] = {
//	    latitude: -21.735556,
//	    longitude: -41.333019
//	}; // | Rio de Janeiro | Campos dos Goytacazes e Região.
//	dddGeo[21] = {
//	    latitude: -22.9028,
//	    longitude: -43.2078
//	}; // | Rio de Janeiro | Região Metropolitana do Rio de Janeiro.
//	dddGeo[24] = {
//	    latitude: -22.906847,
//	    longitude: -43.172896
//	}; // | Rio de Janeiro | Volta Redonda, Petrópolis e Região.
//	dddGeo[27] = {
//	    latitude: -20.3189,
//	    longitude: -40.3378
//	}; // | Espírito Santo | Região Metropolitana de Vitória.
//	dddGeo[28] = {
//	    latitude: -20.846705,
//	    longitude: -41.12022
//	}; // | Espírito Santo | Cachoeiro de Itapemirim e Região.
//	dddGeo[31] = {
//	    latitude: -19.916667,
//	    longitude: -43.933333
//	}; // | Minas Gerais | Região Metropolitana de Belo Horizonte
//	dddGeo[32] = {
//	    latitude: -21.761044,
//	    longitude: -43.347797
//	}; // | Minas Gerais | Juiz de Fora e Região.
//	dddGeo[33] = {
//	    latitude: -18.85892,
//	    longitude: -41.943214
//	}; // | Minas Gerais | Governador Valadares e Região.
//	dddGeo[34] = {
//	    latitude: -18.91953,
//	    longitude: -48.27742
//	}; // | Minas Gerais | Uberlândia e região.
//	dddGeo[35] = {
//	    latitude: -18.512178,
//	    longitude: -44.555031
//	}; // | Minas Gerais | Poços de Caldas, Pouso Alegre, Varginha e Região.
//	dddGeo[37] = {
//	    latitude: -18.512178,
//	    longitude: -44.555031
//	}; // | Minas Gerais | Divinópolis, Itaúna e Região.
//	dddGeo[38] = {
//	    latitude: -16.729319,
//	    longitude: -43.867126
//	}; // | Minas Gerais | Montes Claros e Região.
//	dddGeo[41] = {
//	    latitude: -25.4297,
//	    longitude: -49.2719
//	}; // |Paraná | Região Metropolitana de Curitiba.
//	dddGeo[42] = {
//	    latitude: -24.949608,
//	    longitude: -53.422725
//	}; // | Paraná | Ponta Grossa e Região.
//	dddGeo[43] = {
//	    latitude: -23.309641,
//	    longitude: -51.148806
//	}; // | Paraná | Londrina e Região.
//	dddGeo[44] = {
//	    latitude: -23.450343,
//	    longitude: -51.863671
//	}; // | Paraná | Maringá e Região.
//	dddGeo[45] = {
//	    latitude: -24.953015,
//	    longitude: -53.452892
//	}; // | Paraná | Cascavel e Região.
//	dddGeo[46] = {
//	    latitude: -26.22972,
//	    longitude: -52.671136
//	}; // | Paraná | Francisco Beltrão, Pato Branco e Região.
//	dddGeo[47] = {
//	    latitude: -27.242339,
//	    longitude: -50.218856
//	}; // | Santa Catarina | Joinville, Blumenau, Balneário Camboriú e Região.
//	dddGeo[48] = {
//	    latitude: -27.597022,
//	    longitude: -48.549583
//	}; // | Santa Catarina | Região Metropolitana de Florianópolis e Criciúma.
//	dddGeo[49] = {
//	    latitude: -27.242339,
//	    longitude: -50.218856
//	}; // | Santa Catarina | Chapecó, Lages e Região.
//	dddGeo[51] = {
//	    latitude: -30.034647,
//	    longitude: -51.217658
//	}; // | Rio Grande do Sul | Região Metropolitana de Porto Alegre.
//	dddGeo[53] = {
//	    latitude: -31.767898,
//	    longitude: -52.337498
//	}; // | Rio Grande do Sul | Pelotas e Região.
//	dddGeo[54] = {
//	    latitude: -29.179124,
//	    longitude: -51.149251
//	}; // | Rio Grande do Sul | Caxias do Sul e Região.
//	dddGeo[55] = {
//	    latitude: -29.691483,
//	    longitude: -53.792261
//	}; // | Rio Grande do Sul | Santa Maria e Região.
//	dddGeo[61] = {
//	    latitude: -15.688838,
//	    longitude: -47.817738
//	}; // | Distrito Federal e Goiás | Brasília e Região.
//	dddGeo[62] = {
//	    latitude: -16.666667,
//	    longitude: -49.25
//	}; // | Goiás | Região Metropolitana de Goiânia.
//	dddGeo[63] = {
//	    latitude: -10.17528,
//	    longitude: -48.298247
//	}; // | Tocantins | Todos os municípios do estado.
//	dddGeo[64] = {
//	    latitude: -17.789523,
//	    longitude: -50.920427
//	}; // | Goiás | Rio Verde e Região.
//	dddGeo[65] = {
//	    latitude: -15.601411,
//	    longitude: -56.097892
//	}; // | Mato Grosso | Região Metropolitana de Cuiabá
//	dddGeo[66] = {
//	    latitude: -12.681871,
//	    longitude: -56.921099
//	}; // | Mato Grosso |
//	dddGeo[67] = {
//	    latitude: -12.681871,
//	    longitude: -56.921099
//	}; // | Mato Grosso do Sul | Todos os municípios do estado.
//	dddGeo[68] = {
//	    latitude: -9.023796,
//	    longitude: -70.811995
//	}; // | Acre | Todos os municípios do estado.
//	dddGeo[69] = {
//	    latitude: -11.505734,
//	    longitude: -63.580611
//	}; // | Rondônia | Todos os municípios do estado.
//	dddGeo[71] = {
//	    latitude: -12.970833,
//	    longitude: -38.51083
//	}; // | Bahia | Região Metropolitana de Salvador.
//	dddGeo[73] = {
//	    latitude: -14.788033,
//	    longitude: -39.278418
//	}; // | Bahia | Itabuna, Ilhéus e Região.
//	dddGeo[74] = {
//	    latitude: -9.418046,
//	    longitude: -40.501062
//	}; // | Bahia | Juazeiro e Região.
//	dddGeo[75] = {
//	    latitude: -12.232754,
//	    longitude: -38.949572
//	}; // | Bahia | Feira de Santana e Região.
//	dddGeo[77] = {
//	    latitude: -14.861924,
//	    longitude: -40.844535
//	}; // | Bahia | Vitória da Conquista e Região.
//	dddGeo[79] = {
//	    latitude: -10.574093,
//	    longitude: -37.385658
//	}; // | Sergipe | Todos os municípios do estado.
//	dddGeo[81] = {
//	    latitude: -8.057838,
//	    longitude: -34.882897
//	}; // | Pernambuco | Região Metropolitana de Recife.
//	dddGeo[82] = {
//	    latitude: -9.571306,
//	    longitude: -36.78195
//	}; // | Alagoas | Todos os municípios do estado.
//	dddGeo[83] = {
//	    latitude: -7.239961,
//	    longitude: -36.78195
//	}; // | Paraíba | Todos os municípios do estado.
//	dddGeo[84] = {
//	    latitude: -5.40258,
//	    longitude: -36.954107
//	}; // | Rio Grande do Norte | Todos os municípios do estado.
//	dddGeo[85] = {
//	    latitude: -3.78,
//	    longitude: -38.59
//	}; // | Ceará | Região Metropolitana de Fortaleza.
//	dddGeo[86] = {
//	    latitude: -5.098041,
//	    longitude: -42.758734
//	}; // | Piauí | Região de Teresina.
//	dddGeo[87] = {
//	    latitude: -9.377469,
//	    longitude: -40.535025
//	}; // | Pernambuco | Região de Petrolina.
//	dddGeo[88] = {
//	    latitude: -7.229036,
//	    longitude: -39.312446
//	}; // | Ceará | Região de Juazeiro do Norte.
//	dddGeo[89] = {
//	    latitude: -6.776932,
//	    longitude: -43.022602
//	}; // | Piauí | Região de Picos e Floriano.
//	dddGeo[91] = {
//	    latitude: -1.455833,
//	    longitude: -48.503889
//	}; // | Pará | Região Metropolitana de Belém.
//	dddGeo[92] = {
//	    latitude: -3.079587,
//	    longitude: -60.067331
//	}; // | Amazonas | Região de Manaus.
//	dddGeo[93] = {
//	    latitude: -2.450629,
//	    longitude: -54.700923
//	}; // | Pará | Região de Santarém.
//	dddGeo[94] = {
//	    latitude: -5.381136,
//	    longitude: -49.133102
//	}; // | Pará | Região de Marabá.
//	dddGeo[95] = {
//	    latitude: 2.737597,
//	    longitude: -62.0751
//	}; // | Roraima |Todos os municípios do estado.
//	dddGeo[96] = {
//	    latitude: 2.04474,
//	    longitude: -50.787422
//	}; // | Amapá | Todos os municípios do estado.
//	dddGeo[97] = {
//	    latitude: -4.09449,
//	    longitude: -63.14461
//	}; // | Amazonas | Região de Tefé e Coari.
//	dddGeo[98] = {
//	    latitude: -2.53,
//	    longitude: -44.302778
//	};
//	dddGeo[99] = {
//	    latitude: -5.522392,
//	    longitude: -47.495684
//	};
    }
    
        public Boolean available(int val){
            Boolean answer = false;
            for(int i = 0; i<result.length; i++){
                if(result[i] == val)
                    answer = true;
            }
            return answer;
        }
        public int[] getDDDs(){
            return result;
        }
        
}
