package com.simplekjl.compose.utils

import com.simplekjl.compose.Message
import kotlin.random.Random

data class SampleData(
    val messages: List<Message> = getMessages()
)

private val authors = listOf("Johny", "Jimmy", "Luis", "Carlos", "Berkay")
private val bodyMessage =
    listOf("Hey dude", "What's up?", "Are you guys for real?", "Nice pic, dude")

internal fun getMessages(): List<Message> {
    return listOf(
        Message("Johny","Hey,", imageUrl = "https://thumbs.dreamstime.com/z/woman-natural-beauty-makeup-portrait-fashion-model-touching-face-hands-beautiful-girl-skin-care-treatment-woman-natural-140288618.jpg"),
        Message("Jimmy","Hey,", imageUrl = "https://thumbs.dreamstime.com/z/woman-natural-beauty-makeup-portrait-fashion-model-touching-face-hands-beautiful-girl-skin-care-treatment-woman-natural-140288618.jpg"),
        Message("James","Hey,", imageUrl = "https://thumbs.dreamstime.com/z/woman-natural-beauty-makeup-portrait-fashion-model-touching-face-hands-beautiful-girl-skin-care-treatment-woman-natural-140288618.jpg"),
        Message("Carlos","Hey,", imageUrl = "https://thumbs.dreamstime.com/z/woman-natural-beauty-makeup-portrait-fashion-model-touching-face-hands-beautiful-girl-skin-care-treatment-woman-natural-140288618.jpg"),
        Message("Luis","Hey,", imageUrl = "https://thumbs.dreamstime.com/z/woman-natural-beauty-makeup-portrait-fashion-model-touching-face-hands-beautiful-girl-skin-care-treatment-woman-natural-140288618.jpg"),
        Message("Tomas","Hey,", imageUrl = "https://thumbs.dreamstime.com/z/woman-natural-beauty-makeup-portrait-fashion-model-touching-face-hands-beautiful-girl-skin-care-treatment-woman-natural-140288618.jpg"),
        Message("J","Hey,1", imageUrl = "https://thumbs.dreamstime.com/z/woman-natural-beauty-makeup-portrait-fashion-model-touching-face-hands-beautiful-girl-skin-care-treatment-woman-natural-140288618.jpg"),
        Message("J","Hey,2", imageUrl = "https://thumbs.dreamstime.com/z/woman-natural-beauty-makeup-portrait-fashion-model-touching-face-hands-beautiful-girl-skin-care-treatment-woman-natural-140288618.jpg"),
        Message("J","Hey,3", imageUrl = "https://thumbs.dreamstime.com/z/woman-natural-beauty-makeup-portrait-fashion-model-touching-face-hands-beautiful-girl-skin-care-treatment-woman-natural-140288618.jpg"),
        Message("J","Hey,4", imageUrl = "https://thumbs.dreamstime.com/z/woman-natural-beauty-makeup-portrait-fashion-model-touching-face-hands-beautiful-girl-skin-care-treatment-woman-natural-140288618.jpg"),
        Message("J","Hey,5", imageUrl = "https://thumbs.dreamstime.com/z/woman-natural-beauty-makeup-portrait-fashion-model-touching-face-hands-beautiful-girl-skin-care-treatment-woman-natural-140288618.jpg"),
        Message("J","Hey,6", imageUrl = "https://thumbs.dreamstime.com/z/woman-natural-beauty-makeup-portrait-fashion-model-touching-face-hands-beautiful-girl-skin-care-treatment-woman-natural-140288618.jpg"),
        Message("J","Hey,7", imageUrl = "https://thumbs.dreamstime.com/z/woman-natural-beauty-makeup-portrait-fashion-model-touching-face-hands-beautiful-girl-skin-care-treatment-woman-natural-140288618.jpg"),
        Message("J","Hey,8", imageUrl = "https://thumbs.dreamstime.com/z/woman-natural-beauty-makeup-portrait-fashion-model-touching-face-hands-beautiful-girl-skin-care-treatment-woman-natural-140288618.jpg"),
        Message("J","Hey,9", imageUrl = "https://thumbs.dreamstime.com/z/woman-natural-beauty-makeup-portrait-fashion-model-touching-face-hands-beautiful-girl-skin-care-treatment-woman-natural-140288618.jpg"),
        Message("J","Hey,9", imageUrl = "https://thumbs.dreamstime.com/z/woman-natural-beauty-makeup-portrait-fashion-model-touching-face-hands-beautiful-girl-skin-care-treatment-woman-natural-140288618.jpg"),
    )
}
