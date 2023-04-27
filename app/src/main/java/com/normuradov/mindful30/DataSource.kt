package com.normuradov.mindful30

import com.normuradov.mindful30.model.DailyRecommendation

object Repository {
    val dailyRecommendations = listOf(
        DailyRecommendation(
            dayNumber = 1,
            imageId = R.drawable.day_1,
            teaser = "Take a 5-minute break every hour to stretch and clear your mind.",
            description = "Take a 5-minute break every hour to stretch and clear your mind. As a software engineer, it's easy to get caught up in your work and forget to take breaks. But taking short breaks can actually improve your productivity and focus. Set a timer for every hour and take a 5-minute break to stretch, move around, and clear your mind. This will help you avoid burnout and stay refreshed throughout the day."
        ),
        DailyRecommendation(
            dayNumber = 2,
            imageId = R.drawable.day_2,
            teaser = "Focus on one task at a time and avoid multitasking.",
            description = "Focus on one task at a time and avoid multitasking. As a software engineer, you may be tempted to work on multiple tasks at once. However, research shows that multitasking can actually decrease productivity and increase errors. Instead, try to focus on one task at a time and complete it before moving on to the next one. This will help you stay focused and produce higher-quality work."
        ),
        DailyRecommendation(
            dayNumber = 3,
            imageId = R.drawable.day_3,
            teaser = "Take a mindful walk outside and observe your surroundings.",
            description = "Take a mindful walk outside and observe your surroundings. Spending time in nature has been shown to reduce stress and improve mental health. As a software engineer, you likely spend a lot of time sitting in front of a computer screen. Take a break and go for a mindful walk outside. Observe your surroundings and appreciate the beauty of nature. This can help you feel more relaxed and refreshed when you return to work."
        ),
        DailyRecommendation(
            dayNumber = 4,
            imageId = R.drawable.day_4,
            teaser = "Practice deep breathing exercises to reduce stress.",
            description = "Practice deep breathing exercises to reduce stress. Deep breathing exercises are a simple and effective way to reduce stress. When you feel stressed or overwhelmed, take a few minutes to practice deep breathing. Inhale deeply through your nose, hold for a few seconds, pause for a few seconds, and exhale slowly through your mouth. This can help you feel more relaxed and focused. More practice, improves the effect."
        ),
        DailyRecommendation(
            dayNumber = 5,
            imageId = R.drawable.day_5,
            teaser = "Use the Pomodoro Technique to increase productivity and avoid burnout.",
            description = "Use the Pomodoro Technique to increase productivity and avoid burnout. The Pomodoro Technique is a time-management method that involves working in undistracted intervals followed by short breaks. Set a timer for 25 minutes and work on a task without any interruptions. When the timer goes off, take a 5-minute break to rest and recharge. Repeat this cycle throughout the day. This can help you stay focused and mitigate a burnout in the longer run."
        ),
        DailyRecommendation(
            dayNumber = 6,
            imageId = R.drawable.day_6,
            teaser = "Write down your thoughts and ideas to clear your mind and improve creativity.",
            description = "Write down your thoughts and ideas to clear your mind and improve creativity. As a software engineer, you have many ideas and thoughts running through your mind. Writing them down can help you clear your mind and improve creativity. Keep a notebook or use a note-taking app to jot down your ideas throughout the day. This can help you organize your thoughts and come up with new and innovative solutions."
        ),
        DailyRecommendation(
            dayNumber = 7,
            imageId = R.drawable.day_7,
            teaser = "Collaborate with a colleague on a project to improve teamwork skills.",
            description = "Collaborate with a colleague on a project to improve teamwork skills. Collaboration is an important skill for software engineers. Look for opportunities to collaborate with a colleague on a project. This can help improve teamwork skills and lead to better outcomes."
        ),
        DailyRecommendation(
            dayNumber = 8,
            imageId = R.drawable.day_8,
            teaser = "Take a digital detox day to disconnect from technology and recharge.",
            description = "Take a digital detox day to disconnect from technology and recharge. As a software engineer, you likely spend a lot of time in front of screens. Taking a break from technology can help you recharge and feel more refreshed. Choose a day to disconnect from technology and focus on other activities like reading, spending time with loved ones, or going for a walk. This can help you reduce stress and improve your overall well-being."
        ),
        DailyRecommendation(
            dayNumber = 9,
            imageId = R.drawable.day_9,
            teaser = "Attend a mindfulness workshop or meditation class.",
            description = "Attend a mindfulness workshop or meditation class. Mindfulness workshops and meditation classes can teach you new techniques to improve your focus, reduce stress, and increase well-being. Look for local workshops or classes and make time to attend. This can help you learn new skills and techniques that can be beneficial both for your body and mind. As a starter you can use HeadSpace app. Ask the author @fnormuradov on Telegram for trial."
        ),
        DailyRecommendation(
            dayNumber = 10,
            imageId = R.drawable.day_10,
            teaser = "Start a gratitude journal to improve mental well-being.",
            description = "Start a gratitude journal to improve mental well-being. Gratitude journaling involves writing down things you are grateful for each day. As a software engineer, it's easy to focus on the challenges and stresses of your work. Taking time to focus on the positive can improve your mental well-being and reduce stress. Start a gratitude journal and write down three things you are grateful for each day. This can help shift your focus to the positive and improve your mood."
        ),
        DailyRecommendation(
            dayNumber = 11,
            imageId = R.drawable.day_11,
            teaser = "Take a break from screens before bedtime to improve sleep quality.",
            description = "Take a break from screens before bedtime to improve sleep quality. The blue light emitted by screens can interfere with your circadian rhythm and make it difficult to fall asleep. As a software engineer, you likely spend a lot of time in front of screens. Try to take a break from screens at least an hour before bedtime. This can help you sleep better and feel more rested in the morning."

        ),
        DailyRecommendation(
            dayNumber = 12,
            imageId = R.drawable.day_12, // wrong image
            teaser = "Practice self-compassion to reduce stress and improve mental health.",
            description = "Practice self-compassion to reduce stress and improve mental health. Self-compassion involves treating yourself with kindness and understanding, especially in difficult times. As a software engineer, you may experience stress and burnout. Practicing self-compassion can help reduce stress and improve your mental health. Treat yourself with the same kindness and understanding you would offer a friend in a similar situation. It is not a mistake to refer to yourself as a crying baby. Being gentle and accept the confusion of not understanding personal wishes."
        ),
        DailyRecommendation(
            dayNumber = 13,
            imageId = R.drawable.day_13,
            teaser = "Take a break from social media to improve mental well-being.",
            description = "Take a break from social media to improve mental well-being. Social media can be a source of stress and anxiety. As a software engineer, you may spend a lot of time on social media for work or personal reasons. Try taking a break from social media for a day or two each week. This can help you reduce stress and improve your mental well-being."
        ),
        DailyRecommendation(
            dayNumber = 14,
            imageId = R.drawable.day_14,
            teaser = "Take a course or read a book on a new technology or programming language.",
            description = "Take a course or read a book on a new technology or programming language. Learning new skills can help keep you engaged and motivated in your work. Look for courses or books on a new technology or programming language and make time to learn. This can help you stay up-to-date and improve your job prospects. But if you care about your personal development and read this line, you already cool, most probably you just need to relax."
        ),
        DailyRecommendation(
            dayNumber = 15,
            imageId = R.drawable.day_15,
            teaser = "Eat mindfully today.",
            description = "Eat mindfully today by turning off all screens during your meal. Engage in a nice talk with your family. Ideally, cook the meal together."
        ),
        DailyRecommendation(
            dayNumber = 16,
            imageId = R.drawable.day_16,
            teaser = "PTake a nap today and think about building a habit.",
            description = "Take a nap today and think about building a habit. As a software developer, you know the importance of staying alert, focused, and productive throughout the day. However, with long hours, tight deadlines, and the constant demand for innovation, it can be challenging to maintain your energy and concentration. That's where a daily nap can be a game-changer.\n" +
                    "\n" +
                    "Napping has been shown to improve cognitive function, memory retention, and alertness, all of which are critical for a software developer's job performance. When you take a nap, you give your brain a chance to rest and recharge, which can help you feel more refreshed and energized when you wake up. Additionally, napping can help reduce stress levels, which can lead to improved mood and better decision-making skills.\n" +
                    "\n" +
                    "Another benefit of napping is improved creativity. Research has shown that taking a nap can help your brain make new connections and enhance your ability to think creatively. This is particularly useful for software developers who are constantly working on innovative projects and need to come up with new ideas.\n" +
                    "\n" +
                    "Moreover, napping has been shown to enhance physical health. A daily nap can reduce the risk of heart disease, stroke, and diabetes. Additionally, it can boost your immune system, making you less prone to infections and illnesses.\n" +
                    "\n" +
                    "However, it's important to note that the timing and duration of your nap can make a significant difference. A nap that's too short or too long can leave you feeling groggy and disoriented. Experts recommend taking a nap between 20 to 30 minutes, which is enough to provide the benefits of rest and rejuvenation without disrupting your sleep cycle.\n" +
                    "\n" +
                    "In conclusion, a daily nap can be a powerful tool for software developers looking to improve their productivity, creativity, and overall well-being. By taking a short nap in the afternoon, you can give your brain a chance to recharge, reduce stress levels, and enhance your cognitive abilities. So the next time you feel yourself hitting a mid-day slump, consider taking a quick nap and see how it can improve your performance and mood."
        ),
        DailyRecommendation(
            dayNumber = 17,
            imageId = R.drawable.day_17,
            teaser = "Take a hot bath mindfully today.",
            description = "Take a hot bath mindfully today. Taking a bath can be an effective way for a software developer to unwind and de-stress after a long day of work. The warm water and steam can help relax tense muscles, reduce inflammation, and alleviate soreness. This can be particularly beneficial for software developers who spend long hours sitting at a desk and typing on a keyboard, which can cause tension and pain in the neck, shoulders, and back.\n" +
                    "\n" +
                    "Additionally, taking a bath can help improve mental health. The warm water can help reduce stress levels, promote feelings of calmness, and enhance mood. This can be especially important for software developers who often work in high-pressure environments and need to manage multiple projects simultaneously.\n" +
                    "\n" +
                    "Moreover, taking a bath can be an opportunity to disconnect from technology and digital devices. As a software developer, you likely spend a lot of time staring at screens, which can cause eye strain and fatigue. By taking a bath, you can give your eyes a break from the blue light emitted by screens and help reduce the risk of digital eye strain.\n" +
                    "\n" +
                    "In conclusion, taking a bath can be a simple yet effective way for a software developer to relax, reduce stress levels, and improve physical and mental well-being. By incorporating a bath into your self-care routine, you can improve your overall health and enhance your job performance. So the next time you feel overwhelmed or tense, consider taking a bath and see how it can benefit you."

        ),
        DailyRecommendation(
            dayNumber = 18,
            imageId = R.drawable.day_18,
            teaser = "Take a course on leadership skills.",
            description = "Take a course on leadership skills. Leadership skills are essential for software engineers who want to advance in their careers. Look for courses or books on leadership skills and make time to learn. This can help you develop the skills you need to succeed as a leader in your field."
        ),
        DailyRecommendation(
            dayNumber = 19,
            imageId = R.drawable.day_19,
            teaser = "Practice self-reflection to identify areas for growth and improvement.",
            description = "Practice self-reflection to identify areas for growth and improvement. Self-reflection involves taking time to reflect on your thoughts, feelings, and behaviors. As a software engineer, self-reflection can help you identify areas for growth and improvement. Take time to reflect on your work and your goals. This can help you make more informed decisions and achieve your objectives."
        ),
        DailyRecommendation(
            dayNumber = 20,
            imageId = R.drawable.day_20,
            teaser = "Practice gratitude by thanking a colleague for their hard work.",
            description = "Practicing gratitude is a powerful way to improve your mindset and overall well-being, and one simple way to do so is by expressing appreciation for the people around you. One way to incorporate this practice into your daily routine is by thanking a colleague for their hard work. This not only helps to build a positive relationship with that person but also reminds you of the value of hard work and dedication. By expressing gratitude, you'll cultivate a sense of appreciation for the people and things in your life, which can ultimately lead to a more fulfilling and positive outlook. So take a moment today to thank a colleague for their hard work and notice how it affects your mood and overall outlook on life."
        ),
        DailyRecommendation(
            dayNumber = 21,
            imageId = R.drawable.day_21,
            teaser = "Practice mindful reading.",
            description = "Practice mindful reading. As a software developer, you can apply the skill of mindful reading to various aspects of your work and personal life. For instance, when you're working on a complex codebase, you can use mindful reading to focus your attention on the code and avoid distractions. By reading and understanding each line of code with full attention, you can spot errors and bugs more quickly and efficiently. You can also use mindful reading to better understand technical documentation, user feedback, or customer reviews, which can help you improve your products and services.\n" +
                    "\n" +
                    "In your personal life, you can use mindful reading to stay present and engaged in conversations with your colleagues, family, or friends. By actively listening and paying attention to the words and tone of the speaker, you can improve your communication skills and build stronger relationships. You can also use mindful reading to enrich your hobbies and interests, such as reading tech blogs, coding books, or industry news. By staying mindful and fully immersed in your reading, you can gain new insights and perspectives, and stay up-to-date with the latest trends and developments in your field.\n" +
                    "\n" +
                    "Overall, the skill of mindful reading can have a profound impact on your life as a software developer, and beyond. It can help you stay focused, improve your productivity, and enhance your overall well-being. So give it a try and see how it can benefit you in both your personal and professional life."

        ),
        DailyRecommendation(
            dayNumber = 22,
            imageId = R.drawable.day_22,

            teaser = "Practice active listening to improve communication skills.",
            description = "Practice active listening to improve communication skills. Active listening involves fully focusing on the speaker and responding appropriately. As a software engineer, effective communication is essential to teamwork and project success. Practice active listening by fully focusing on the speaker during conversations and responding appropriately. This can help improve your communication skills and lead to better outcomes. (if you read this, you have noticed the duplication)"

        ),
        DailyRecommendation(
            dayNumber = 23,
            imageId = R.drawable.day_23,
            teaser = "Practice deep breathing to reduce stress and anxiety.",
            description = "Practice deep breathing to reduce stress and anxiety. Deep breathing involves breathing slowly and deeply from your diaphragm. As a software engineer, you may experience stress and anxiety related to your work. Practice deep breathing for a few minutes each day to help reduce stress and anxiety. This can help you feel more calm and focused."
        ),
        DailyRecommendation(
            dayNumber = 24,
            imageId = R.drawable.day_24,
            teaser = "Take a break and go for a nature walk to reduce stress.",
            description = "Take a break and go for a nature walk to reduce stress. Spending time in nature can help reduce stress and improve mental well-being. As a software engineer, you may spend a lot of time indoors and in front of screens. Take a break and go for a nature walk to help reduce stress and improve your mood."
        ),
        DailyRecommendation(
            dayNumber = 25,
            imageId = R.drawable.day_25,
            teaser = "Practice time management skills to improve productivity.",
            description = "Practice time management skills to improve productivity. Effective time management is essential for software engineers who want to be productive and efficient. Look for time management strategies and techniques and make time to implement them. This can help you improve your productivity and achieve your goals."
        ),
        DailyRecommendation(
            dayNumber = 26,
            imageId = R.drawable.day_26,
            teaser = "Take a break and spend time with loved ones to improve well-being.",
            description = "Take a break and spend time with loved ones to improve well-being. Spending time with loved ones can improve mood and reduce stress. As a software engineer, it's easy to get caught up in work and neglect relationships. Make time to take a break and spend time with loved ones."
        ),
        DailyRecommendation(
            dayNumber = 27,
            imageId = R.drawable.day_27,
            teaser = "Ask questions differently today.",
            description = "Ask questions differently today. Asking questions differently can be an effective way for software developers to improve their problem-solving skills and enhance their ability to think critically. By asking questions from a different perspective, developers can gain new insights and discover alternative solutions that they may not have considered before.\n" +
                    "\n" +
                    "For example, instead of asking \"How can we fix this bug?\", a developer could ask \"What would happen if we didn't fix this bug?\". This question prompts the developer to consider the potential consequences of leaving the bug unfixed and may reveal new information that could inform their decision-making process.\n" +
                    "\n" +
                    "Moreover, asking questions differently can also help developers communicate more effectively with their colleagues and stakeholders. By asking open-ended questions and avoiding assumptions, developers can gain a deeper understanding of the problem at hand and collaborate more effectively with others to find a solution.\n" +
                    "\n" +
                    "In conclusion, asking questions differently can be a valuable skill for software developers to develop. By adopting a curious and open-minded approach to problem-solving, developers can improve their ability to think critically and communicate effectively with others, ultimately leading to better outcomes for their projects and teams."
        ),
        DailyRecommendation(
            dayNumber = 28,
            imageId = R.drawable.day_28,
            teaser = "Try a new hobby or activity to stimulate creativity.",
            description = "Try a new hobby or activity to stimulate creativity. Exploring new hobbies or activities can stimulate creativity and lead to new insights and ideas. As a software engineer, creativity is essential to problem-solving and innovation. Try a new hobby or activity, such as painting, photography, or playing a musical instrument. This can help stimulate your creativity and improve your well-being."

        ),
        DailyRecommendation(
            dayNumber = 29,
            imageId = R.drawable.day_29,
            teaser = "Take a break and meditate to improve focus and reduce stress.",
            description = "Take a break and meditate to improve focus and reduce stress. Meditation involves focusing on the present moment and calming the mind. As a software engineer, meditation can help you improve focus and reduce stress. Take a break and meditate for ten or fifteen minutes today. This can help you feel more focused and calm throughout the day."
        ),
        DailyRecommendation(
            dayNumber = 30,
            imageId = R.drawable.day_30,
            teaser = "Reflect on your progress and set new goals for personal and professional growth.",
            description = "Reflect on your progress and set new goals for personal and professional growth. Reflecting on your progress and setting new goals can help you stay motivated and focused on personal and professional growth. Take time to reflect on the past 30 days and the progress you have made. Set new goals for the future and create an action plan to achieve them. This can help you continue to grow and improve as a person and developer. If you read this point, thanks! Please, drop me a line on Telegram @fnormuradov. I will be happy to learn about your experience."
        ),
    )
}