package ma.xproce.charity_app.web;

import ma.xproce.charity_app.Service.IActionService;
import ma.xproce.charity_app.dao.entities.Action;
import ma.xproce.charity_app.dao.entities.Organisateur;
import ma.xproce.charity_app.dao.repositories.ActionRepository;
import ma.xproce.charity_app.dao.repositories.DonRepository;
import ma.xproce.charity_app.dto.ActionDto;
import ma.xproce.charity_app.dto.OrganisateurDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ActionController {
    @Autowired
    IActionService iActionService;
    @Autowired
    private DonRepository donRepository;
    @Autowired
    private ActionRepository actionRepository;

    @GetMapping("/dons")
    public String actions(@RequestParam Integer idDon, Model model) {
        List<ActionDto> actions = iActionService.donsParAction(idDon);
        if (actions.isEmpty()) {
            model.addAttribute("error", "Aucun don.");
        }
        model.addAttribute("actions", actions);
        return "actions";
    }

    @GetMapping("/enregistrerAction")
    public String showenregistrerAction(Model model) {
        //model.addAttribute("organisateur", new OrganisateurDto());
        model.addAttribute("action", new ActionDto());
        return "enregistrerAction";
    }

    @GetMapping("/actions")
    public String listActions(Model model) {
        List<Action> actions = actionRepository.findAll();
        model.addAttribute("actions", actions);
        return "actions";
    }

    @PostMapping("/enregistrerAction")
    public Action enregistrerReservation(@ModelAttribute ActionDto action) {
        return iActionService.enregistrerAction(action);
    }

}
