$ ->
    $.get "/getstudents", (students) ->
        $.each students, (index, student) ->
            $('#liststudents').append $("<li>").text "Alumno: " + student.name + " " + student.lastname + " - Semestre: " + student.semester