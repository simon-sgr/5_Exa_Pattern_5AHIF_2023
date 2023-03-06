package at.kaindorf.pattern.decorator.GameCharacterExample;

/**
 * <h3>Created by IntelliJ IDEA.</h3><br>
 * <b>Project:</b> Exa_Pattern_5AHIF_2023<br>
 * <b>User:</b> Simon Schoeggler<br>
 * <b>Date:</b> 06. März 2023<br>
 * <b>Time:</b> 12:27<br>
 */

public abstract class SkillDecorator extends GameCharacter {
    protected GameCharacter gameCharacter;

    public SkillDecorator(GameCharacter gameCharacter) {
        this.gameCharacter = gameCharacter;
    }
}
