package com.example.lab_8

class Wizard(val name: String, var mana: Int, var spellPower: Int) {
    fun castSpell(spell: String): Int {
        when (spell) {
            "Explosion" -> {
                if (mana >= 10) {
                    mana -= 10
                    return spellPower * 3
                } else return 0 // not enough mana
            }
            "Frostbite" -> {
                if (mana >= 5) {
                    mana -= 5
                    return spellPower * 2
                } else return 0 // not enough mana
            }
            else -> {
                return 0 // invalid spell
            }
        }
    }

    fun restoreMana(amount: Int) {
        mana = minOf(100, mana + amount)
    }

    /** increases spell power by 1 if mana is greater than 5, then decreases mana by 5
     * else if mana is less than 5 then nothing is done
     * @return Unit
     * */
    fun train() {
        if (mana >= 5) {
            spellPower += 1
            mana -= 5
        }
    }
}