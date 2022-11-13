class Main {
  public static void main(String[] args) {

// initialise instance variables
        Alumno a1 = new Alumno("Juan","García","López",1976,666,"Henao",false,true);
        Alumno a2 = new Alumno("Pedro","Ruiz","Belencoso",1982,555,"Ercilla",true,true);
        Alumno a3 = new Alumno("Ana","Sola","Leal",1985,444,"Sol",true,false);
        Alumno a4 =new Alumno("Rosa","López","Meléndez",1990,2109,"Iparragirre",false,false);
        Alumno a5 = new Alumno("Rubén","Martín","Pola",1990,888,"trillo",true,true);
        Aula A= new Aula("Beethoven",1,10,true,true);
        Aula B = new Aula ("Liszt",2,15,true,true);
        Materia m1 = new Materia ("Solfeo",100,true,true);
        Materia m2 = new Materia ("armonía",100,true,false);
        Materia m3 = new Materia ("Solfeo2",150,true,true);
        Profesor p1 = new Profesor("Jose_Ignacio","Fedriani","Ramos",555,"Rekalde");
        Profesor p2 = new Profesor("Manel","Ruiz","Gil",334,"Amara");
        Grupo g1 = new Grupo ("piano","cinco_y_media", A,p1);
        Grupo g2= new Grupo ("violín","siete",A,p1);
        Grupo g3 = new Grupo ("saxo","seis",B,p2);
        g1.addAlumno( a1);
        g1.addAlumno( a2);
        g1.addAlumno( a3);
             
        g2.addAlumno(a1);
        g2.addAlumno(a4);
       
                         
        m1.addGrupo(g1);
        m1.addGrupo(g2);
        m2.addGrupo(g2);
        m3.addGrupo(g1);
        m3.addGrupo(g2);
        Academia one = new Academia("one","Gran_Via");
       
       
        one.addMateria(m3);     
        one.addMateria(m2);
        one.addMateria(m1);
        one.MostrarMaterias();
        one.ListadoAlumnos();
        Date Marzo ;
        Marzo = new Date(1,2,3,4,5,6);
        Factura f1= new Factura (a1,Marzo);
       
        f1.MostrarFactura();
        g1.FAC("Juan");
         one.FacturarTodos();
    }

  Clase Alummno:
public class Alumno extends Persona
{
    //variables propias
   
    private int anyo_de_nacimiento;
    private boolean empadronado;
    private boolean familia_numerosa;
    private ArrayList<Grupo>grupos;
   

    /**
     * Constructor para objetos Alumno con todos los atributos
   
     */
   
     public Alumno (String nombre,String ap1,String ap2,int anyo_de_nacimiento,int nº_telefono,String dirección,boolean empadronado,boolean familia_numerosa)
    {
        // initialise instance variables
        super (nombre,ap1,ap2,nº_telefono,dirección);
        this.anyo_de_nacimiento=anyo_de_nacimiento;
        this.empadronado=empadronado;
        this.familia_numerosa=familia_numerosa;
        this.grupos=new ArrayList<Grupo>();
       
    }
clase Person
public abstract  class Persona
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int nº_telefono;
    private String dirección;

    /**
     * Constructor de la clase Persona con todos sus atributos
     */
    public Persona(String nombre,String ap1,String ap2,int nº_telefono,String dirección)
    {
        this.nombre=nombre;
        apellido1=ap1;
        apellido2=ap2;
        this.nº_telefono=nº_telefono;
        this.dirección=dirección;// initialise instance variables
       
    }

clase grupo
public class Grupo
{
    // instance variables - replace the example below with your own
    private String Identificador;
    private String horario;
    private ArrayList<Alumno>alumnos;
    private Aula aula;
   
    private Profesor profesor;

    /**
     * Constructor for objects of class Grupo
     */
    public Grupo(String ide,String horario,Aula aula,Profesor profesor)
    {
        // initialise instance variables
        Identificador=ide;
        this.horario=horario;
        this.alumnos=new ArrayList<Alumno>();
        this.aula=aula;       
        this.profesor=profesor;
    }
clase materia
public class Materia
{
    // instance variables - replace the example below with your own
    private String nombre;
    private int cuota;
    private boolean requiere_piano;
    private boolean requiere_audiovisuales;
    private ArrayList<Grupo>instrumentos;

    /**
     * Constructor for objects of class Materia
     */
    public Materia(String nombre,int cuota,boolean requiere_piano,boolean requiere_audiovisuales)
    {
        // initialise instance variables
        this.nombre=nombre;
        this.cuota=cuota;
        this.requiere_piano =requiere_piano;
        this.requiere_audiovisuales=requiere_audiovisuales;
        this.instrumentos=new ArrayList<Grupo>();
   
    }
public class Academia
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String adress;
    private ArrayList<Materia>materias;
    private ArrayList<Alumno>alumnos;
    private ArrayList<Factura>facturas;

    /**
     * Constructor for objects of class Academia
     */
    public Academia(String nombre,String adress)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.adress=adress;
        this.materias = new ArrayList<Materia>();
        this.alumnos = new ArrayList<Alumno>();
        this.facturas = new ArrayList<Factura>();
    } 
 public class Factura
{
    // instance variables - replace the example below with your own
    private Alumno alumno;
    private Date date;
    private float total;
    private ArrayList<Materia>materiasFacturadas;
   

    /**
     * Constructor for objects of class Factura
     */
    public Factura(Alumno alumno,Date date)
    {
        // initialise instance variables
        this.alumno =alumno;
        this.date =date;
     }
