package io.github.yeobara.android.meetup

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
public class Attendee(val userId: String,
                      val status: String) {

    constructor() : this("", "") {
    }
}

