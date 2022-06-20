package controller;
import model.SubjectsEnum;
import repository.GradesRepository;
import views.servicesEntry.ReleaseGradeBySubject;
import views.creation.CreateRegistration;
import views.menus.MainMenu;
import views.menus.SelectStudentMenu;
import views.menus.SelectSubjectMenu;
import views.show.ShowGradeBySubject;
import views.show.ShowGradeReportByStudent;
import java.util.Scanner;

public class MainMenuController {
        private static final Scanner sc = new Scanner(System.in);

        public static void run() {
            String option = new MainMenu().run(sc);

            switch (option) {
                case "0":
                    MainMenu.exit();
                    return;
                case "1":
                    SubjectsEnum subject = SubjectsEnum.values()[new SelectSubjectMenu().run(sc)];
                    GradesRepository.clean(subject);
                    ReleaseGradeBySubject.run(subject, sc);
                    sc.nextLine(); // clean sc
                    break;
                case "2":
                    subject = SubjectsEnum.values()[new SelectSubjectMenu().run(sc)];
                    ShowGradeBySubject.run(subject);
                    sc.nextLine(); // clean sc
                    break;
                case "3":
                    ShowGradeReportByStudent.run(new SelectStudentMenu().run(sc));
                    DeliveryMenuController.run(sc);
                    break;
                case "4":
                    CreateRegistration.run(sc);
                    break;
                default:
                    MainMenu.invalidOption();
                    break;
            }

            MainMenuController.run();
        }
}
