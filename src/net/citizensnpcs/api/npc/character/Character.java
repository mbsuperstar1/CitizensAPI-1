package net.citizensnpcs.api.npc.character;

import net.citizensnpcs.api.npc.NPC;

public interface Character extends Trait {
	/**
	 * Gets the unique name of this character
	 * 
	 * @return Name of the character
	 */
	public String getName();

	/**
	 * Called when an NPC is left-clicked
	 * 
	 * @param npc
	 *            NPC that was left-clicked
	 */
	public void onLeftClick(NPC<?> npc);

	/**
	 * Called when an NPC is right-clicked
	 * 
	 * @param npc
	 *            NPC that was right-clicked
	 */
	public void onRightClick(NPC<?> npc);
}