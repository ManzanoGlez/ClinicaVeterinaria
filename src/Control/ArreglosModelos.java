package Control;

import Objetos.Cliente;
import Objetos.Factura;
import Objetos.Mascota;
import Objetos.Servicios;
import Objetos.Usuarios_Login;
/*
 * @author Manzano
 */

public class ArreglosModelos {

    //Arreglo Usuarios para el login
    public Usuarios_Login ArreUser[];
    public int ContUser;

    //Arreglo Clientes
    public Cliente ArreCliente[];
    public int ContClientes;

    //Arreglo Mascota
    public Mascota ArreMascota[];
    public int ContMascotas;

    //Arreglo Servicio
    public Servicios ArreServicio[];
    public int ContServicios;

    //Arreglo Factura
    public Factura ArreFactura[];
    public int ContFactura;

    public static int Tam = 100; // Tamaño del arreglo

    public static int AsignaIDServicio = 0;//La que asigna el numero del servicio

    public ArreglosModelos() {

        //Inizializacion arreglo Usuario login
        ArreUser = new Usuarios_Login[Tam];

        for (int i = 1; i < Tam; i++) { // Arreglo empieza en 1 por el precargdo
            ArreUser[i] = new Usuarios_Login();
        }
        /*Zona de datos Precargados*/
        ArreUser[0] = new Usuarios_Login("1", "1");//Usuario precargado de Usuario Login en posicion 0
       /*Fin Zona de datos Precargados*/
        ContUser = 1;//Contador

        //Inizializacion arreglo Cliente
        ArreCliente = new Cliente[Tam];
        for (int i = 10; i < Tam; i++) {
            ArreCliente[i] = new Cliente();
        }
        /*Zona de datos Precargados*/
        //Correo,RFC,Fecha,NumMascotas
        ArreCliente[0] = new Cliente("Jorge", "Manzano", "manzanoglez1995@gmail.com", "MAG951219GQ1", "15-07-2017", "Volcan de fuego #2340 int 8", "3334586668", 1);
        ArreCliente[1] = new Cliente("Sandy", "Magallanes", "Sandy-199414@hotmail.es", "SMALS971212P", "19/05/2017", "Perhielo #2343", "3339106420", 1);
        ArreCliente[2] = new Cliente("Ruben", "Retana", "rubenmarvel@gmail.com", "MRENY981247B", "09/03/2017", "Sebastian Bahs #12", "3378107513", 1);
        ArreCliente[3] = new Cliente("Osvaldo", "Arteaga", "warteaga5@hotmail.com", "MHFKF8752274", "28/04/2017", "Nicolas leaño #75", "3310973952", 1);
        ArreCliente[4] = new Cliente("Carlos", "Villareal", "carlo23@hotmail.com", "KFBEKF648692", "28/01/2017", "Nogal #1528", "3331816959", 1);
        ArreCliente[5] = new Cliente("Claudia", "Gonzalez", "clau12@gmail.com", "BHJTB68294BK", "08/02/2017", "Felipe Rubalcaba #106", "3317072048", 1);
        ArreCliente[6] = new Cliente("Alexis", "Mendoza", "alexismen@hotmail.com", "GHDND8978VFU", "11/11/2017", "Andromeda #130", "3339917025", 1);
        ArreCliente[7] = new Cliente("Kamila", "Salmeron", "kami@outlook.com", "BKBSSB87373C", "17/06/2017", "San Luis Gonzaga #2172", "3334586279", 1);
        ArreCliente[8] = new Cliente("Gustavo", "Rosales", "gus76@hotmail.com", "NFBWSL796CDF", "22/09/2017", "San Fray de Sumarraga #305", "3338806871", 1);
        ArreCliente[9] = new Cliente("Edgar", "Villegas", "villed@hotmail.com", "NCBCL6793HDV", "25/0/2017", "Simon Bolivar #", "3334401972", 1);

        /*Fin Zona de datos Precargados*/
        ContClientes = 10;//Contador

        //Inizializacion arreglo Mascotas
        ArreMascota = new Mascota[Tam];
        for (int i = 10; i < Tam; i++) {
            ArreMascota[i] = new Mascota();
        }
        /*Zona de datos Precargados*/

        //Nombre,Especie,Raza,edad,Cliente
        ArreMascota[0] = new Mascota("Tobby", "Perro", "Labrador", "Macho", "1 año", ArreCliente[0]);
        ArreMascota[1] = new Mascota("Foxy", "Perro", "Pomerania", "Hembra", "2 años", ArreCliente[1]);
        ArreMascota[2] = new Mascota("Spok", "Caballo", "Pony", "Macho", "2 meses", ArreCliente[2]);
        ArreMascota[3] = new Mascota("Max", "Perro", "Pitbull", "Macho", "4 años", ArreCliente[3]);
        ArreMascota[4] = new Mascota("Firulais", "Perro", "Salchicha", "Hembra", "1 año", ArreCliente[4]);
        ArreMascota[5] = new Mascota("Rex", "Conejo", "Bulldog", "Macho", "2 años", ArreCliente[5]);
        ArreMascota[6] = new Mascota("Coco", "Perro", "Chihuahua", "Macho", "8 meses", ArreCliente[6]);
        ArreMascota[7] = new Mascota("Pinky", "Perro", "Labrador", "Hembra", "7 meses", ArreCliente[7]);
        ArreMascota[8] = new Mascota("Garfield", "Gato", "Siames", "Macho", "1 mes", ArreCliente[8]);
        ArreMascota[9] = new Mascota("Poo", "Gato", "Persa", "Hembra", "7 años", ArreCliente[9]);

        /*Fin Zona de datos Precargados*/
        ContMascotas = 10;

        //Inizializacion Arreglo Servicio
        ArreServicio = new Servicios[Tam];
        for (int i = 0; i < Tam; i++) {
            ArreServicio[i] = new Servicios();
        }
        /*Zona de datos Precargados*/

        /*Fin Zona de datos Precargados*/
        ContServicios = 0;//Contador

        //Inizializacion arreglo Factura
        ArreFactura = new Factura[Tam];
        for (int i = 0; i < Tam; i++) {
            ArreFactura[i] = new Factura();
        }
        /*Zona de datos Precargados*/

        /*Fin Zona de datos Precargados*/
        ContFactura = 0;//Contador

    }

}
