package at.kaindorf.pattern.decorator.GameCharacterExample;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> Exa_Pattern_5AHIF_2023<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 06. März 2023<br>
 * <b>Time:</b> 12:29<br>
 */

public class CombatPowerDecorator extends SkillDecorator {
    public CombatPowerDecorator(GameCharacter gameCharacter) {
        super(gameCharacter);
    }

    @Override
    public String getDescription() {
        return gameCharacter.getDescription() + " with Combat Power";
    }
}
