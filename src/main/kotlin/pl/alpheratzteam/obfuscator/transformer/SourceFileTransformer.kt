package pl.alpheratzteam.obfuscator.transformer

import pl.alpheratzteam.obfuscator.Obfuscator
import pl.alpheratzteam.obfuscator.api.transformer.Transformer
import pl.alpheratzteam.obfuscator.util.StringUtil

/**
 * @author Unix
 * @since 18.12.2020
 */

class SourceFileTransformer : Transformer {
    override fun transform(obfuscator: Obfuscator) = obfuscator.classes.forEach { it.value.sourceFile = StringUtil.generateString(Byte.MAX_VALUE.toInt()) }
}