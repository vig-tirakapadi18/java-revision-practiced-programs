import java.util.Scanner;

class Patient {
    int pId;
    String pName;
    int pAge;
    String pDisease;
    String pDName;
}

class Doctor {
    int dId;
    String dName;
    String dPName;
}

class PatientDoctorApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the num of Patient Objects: ");
        int pObj = s.nextInt();
        System.out.println("Enter the number of Doctor Objects: ");
        int dObj = s.nextInt();

        Patient pat[] = new Patient[pObj];
        Doctor doc[] = new Doctor[dObj];

        for(int i = 0; i <= pat.length - 1; i++) {
            pat[i] = new Patient();
        }

        for(int i = 0; i <= doc.length - 1; i++) {
            doc[i] = new Doctor();
        }

        for(int i = 0; i <= pat.length - 1; i++) {
            System.out.println("Enter the Patient Id of "+i+" : ");
            pat[i].pId = s.nextInt();
            System.out.println("Enter the Patient Name of "+i+" : ");
            pat[i].pName = s.next();
            System.out.println("Enter the Patient Age of "+i+" : ");
            pat[i].pAge =  s.nextInt();
            System.out.println("Enter the Patient Disease of "+i+" : ");
            pat[i].pDisease = s.next();
            System.out.println("Enter the Patient's Doctor Name of "+i+" : ");
            pat[i].pDName = s.next();
        }

        for(int i = 0; i <= doc.length - 1; i++) {
            System.out.println("Enter the Doctor Id of "+i+" : ");
            doc[i].dId = s.nextInt();
            System.out.println("Enter the Doctor Name of "+i+" : ");
            doc[i].dName = s.next();
            System.out.println("Enter the Doctor's Patient of "+i+" : ");
            doc[i].dPName =  s.next();
        }

        for(int i = 0; i <= pat.length - 1; i++) {
            System.out.println(pat[i].pId+" "+pat[i].pName+" "+pat[i].pAge+" "+pat[i].pDisease+" "+pat[i].pDName);
        }

        for(int i = 0; i <= doc.length - 1; i++) {
            System.out.println(doc[i].dId+" "+doc[i].dName+" "+doc[i].dPName);
        }

        s.close();
    }
}
