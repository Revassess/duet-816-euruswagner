select au.username, flashcard.question, flashcard.answer, category.name from flashcard inner join category using(category_id) inner join study_set_card ssc using(flashcard_id)	inner join study_set ss using(study_set_id)	inner join app_user au on ss.owner_id = au.user_id and au.user_id = 5;