package ma.xproce.charity_app;

import ma.xproce.charity_app.dao.entities.Action;
import ma.xproce.charity_app.dao.entities.Don;
import ma.xproce.charity_app.dao.entities.Organisateur;
import ma.xproce.charity_app.dao.repositories.ActionRepository;
import ma.xproce.charity_app.dao.repositories.DonRepository;
import ma.xproce.charity_app.dao.repositories.OrganisateurRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@SpringBootApplication
public class CharityAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CharityAppApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ActionRepository actionRepository, OrganisateurRepository organisateurRepository, DonRepository donRepository) {
		return args -> {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

			try {
				java.util.Date utilDate1 = dateFormat.parse("2025/01/10");
				java.util.Date utilDate2 = dateFormat.parse("2025/01/11");
				java.util.Date utilDate3 = dateFormat.parse("2025/01/12");

				Date sqlDate1 = new Date(utilDate1.getTime());
				Date sqlDate2 = new Date(utilDate2.getTime());
				Date sqlDate3 = new Date(utilDate3.getTime());
				Organisateur organisateur1 = Organisateur.builder()
						.nomOrganisateur("Association Humanitaire")
						.emailOrganisateur("contact@humanitaire.org")
						.build();

				Organisateur organisateur2 = Organisateur.builder()
						.nomOrganisateur("Organisation de Secours")
						.emailOrganisateur("info@secours.org")
						.build();

				Organisateur organisateur3 = Organisateur.builder()
						.nomOrganisateur("Fondation pour l'Éducation")
						.emailOrganisateur("education@fondation.org")
						.build();

				organisateurRepository.saveAll(List.of(organisateur1, organisateur2, organisateur3));

				// Création des dons
				Don don1 = Don.builder()
						.titreDon("Don de vêtements")
						.montantDon("N/A")
						.typeDon(Don.TypeDon.BIEN)
						.build();

				Don don2 = Don.builder()
						.titreDon("Don en argent")
						.montantDon("5000.0")
						.typeDon(Don.TypeDon.ARGENT)
						.build();

				Don don3 = Don.builder()
						.titreDon("Don de nourriture")
						.montantDon("N/A")
						.typeDon(Don.TypeDon.BIEN)
						.build();

				donRepository.saveAll(List.of(don1, don2, don3));

				List<Action> actions = List.of(
						Action.builder()
								.titreAction("Action 1")
								.Description("Description de l'Action 1")
								.dateCreation(sqlDate1)
								.montantAction(1000.0)
								.etat(Action.EtatAction.PREPARATION)
								.organisateur(organisateur1)
								.dons(List.of(don1, don2))
								.build(),
						Action.builder()
								.titreAction("Action 2")
								.Description("Description de l'Action 2")
								.dateCreation(sqlDate2)
								.montantAction(2000.0)
								.etat(Action.EtatAction.OUVERTE)
								.organisateur(organisateur2)
								.dons(List.of(don3))
								.build(),
						Action.builder()
								.titreAction("Action 3")
								.Description("Description de l'Action 3")
								.dateCreation(sqlDate3)
								.montantAction(1500.0)
								.etat(Action.EtatAction.TERMINEE)
								.organisateur(organisateur3)
								.dons(List.of())
								.build()
				);


				actionRepository.saveAll(actions);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		};
	}
}