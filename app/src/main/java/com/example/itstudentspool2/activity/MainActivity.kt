package com.example.itstudentspool2.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.itstudentspool2.BlogAdapter
import com.example.itstudentspool2.data.BlogData
import com.example.itstudentspool2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val blogList = listOf(
        BlogData(
            title = "John Doe",
            jobDescription = "Software Engineer",
            descriptionShort = "Software Engineer responsible for designing and developing applications.",
            description = "Software Engineer\n\nResponsible for designing, developing, and maintaining software applications. In this role, I work closely with cross-functional teams to deliver high-quality code and solutions. My responsibilities include conducting code reviews and ensuring adherence to coding standards.\n\nI also troubleshoot and debug software issues, ensuring that our applications are running smoothly and efficiently. I participate in the full software development lifecycle, from initial concept and design to testing and deployment. This involves working closely with other team members, including project managers, designers, and other developers, to ensure that all aspects of the software development process are coordinated and running smoothly.",
            chipList = listOf("Java", "Kotlin")
        ),
        BlogData(
            title = "Jane Smith",
            jobDescription = "Marketing Manager",
            descriptionShort = "Marketing Manager developing and implementing marketing strategies.",
            description = "Marketing Manager\n\nIn my role as Marketing Manager, I develop and implement marketing strategies to promote our products and services. This involves analyzing market trends and competitors to identify opportunities for growth and improvement.\n\nI plan and execute marketing campaigns across various channels, including social media, email, and traditional media. I measure and analyze campaign performance and adjust our strategies accordingly to maximize our return on investment.\n\nIn addition to these responsibilities, I manage a team of marketing professionals and coordinate our activities to ensure that we are all working towards the same goals. I also report our marketing results to senior management, providing them with the information they need to make informed decisions about our marketing strategy.",
            chipList = listOf("SEO", "Google Analytics")
        ),
        BlogData(
            title = "Michael Johnson",
            jobDescription = "Financial Analyst",
            descriptionShort = "Financial Analyst conducting financial analysis to support business decisions.",
            description = "Financial Analyst\n\nAs a Financial Analyst, I conduct financial analysis to support business decision-making. I prepare and analyze financial reports and forecasts, providing insights into the financial health of the organization.\n\nI monitor and evaluate financial performance and identify areas for improvement. I also assist in budgeting and financial planning processes, helping to ensure that the organization's financial goals are met.\n\nI collaborate with other departments to gather financial data and provide financial insights and recommendations to management. My work helps to inform strategic decision-making and ensure the financial stability of the organization.",
            chipList = listOf("Excel", "Financial Modeling", "Risk Analysis")
        ),
        BlogData(
            title = "Emily Brown",
            jobDescription = "Graphic Designer",
            descriptionShort = "Graphic Designer creating visually appealing and engaging designs.",
            description = "Graphic Designer\n\nAs a Graphic Designer, I create visually appealing and engaging designs for various projects. I collaborate with clients and team members to understand design requirements and create designs that meet these requirements.\n\nI use graphic design software to produce high-quality visual content. I incorporate feedback and make necessary revisions to designs to ensure they meet client expectations.\n\nI stay up-to-date with design trends and best practices, continually improving my skills and knowledge. I strive to create designs that not only look good, but also serve their intended purpose effectively.",
            chipList = listOf("Photoshop", "Illustrator", "InDesign")
        ),
        BlogData(
            title = "William Martinez",
            jobDescription = "Human Resources Manager",
            descriptionShort = "Human Resources Manager overseeing all HR functions.",
            description = "Human Resources Manager\n\nAs a Human Resources Manager, I oversee all HR functions, including recruitment, onboarding, and employee relations. I develop and implement HR policies and procedures to ensure compliance and efficiency.\n\nI conduct training and development programs for employees, helping them to improve their skills and advance their careers. I manage employee performance evaluations and career progression, ensuring that employees are recognized and rewarded for their contributions.\n\nI also handle employee grievances and disciplinary actions, ensuring that all employees are treated fairly and that any issues are resolved promptly and effectively.",
            chipList = listOf("Recruitment")
        ),
        BlogData(
            title = "Olivia Wilson",
            jobDescription = "Data Scientist",
            descriptionShort = "Data Scientist analyzing large datasets and extracting meaningful insights.",
            description = "Data Scientist\n\nAs a Data Scientist, I analyze large datasets and extract meaningful insights. I develop and implement machine learning algorithms and models, helping to automate processes and improve decision-making.\n\nI collaborate with data engineers to collect and preprocess data, ensuring that the data is clean and suitable for analysis. I communicate my findings to non-technical stakeholders effectively, helping them to understand the implications of the data.\n\nI stay updated with the latest data science techniques and tools, continually improving my skills and knowledge. I strive to use data to drive improvements and innovations in the organization.",
            chipList = listOf("Python")
        ),
        BlogData(
            title = "James Lee",
            jobDescription = "Product Manager",
            descriptionShort = "Product Manager leading the product development process.",
            description = "Product Manager\n\nAs a Product Manager, I lead the product development process from concept to launch. I conduct market research and gather customer feedback to identify opportunities for new products or improvements to existing products.\n\nI define product requirements and prioritize features, working closely with engineering and design teams to implement these features. I also develop and execute product marketing strategies, helping to promote our products and drive sales.\n\nI strive to create products that meet the needs of our customers and provide value to the organization. I continually monitor and evaluate product performance and make adjustments as necessary to ensure the success of our products.",
            chipList = listOf("Agile", "Scrum", "Product Roadmap")
        ),
        BlogData(
            title = "Ava Rodriguez",
            jobDescription = "Content Writer",
            descriptionShort = "Content Writer creating compelling and SEO-friendly content.",
            description = "Content Writer\n\nAs a Content Writer, I create compelling and SEO-friendly content for various platforms. I conduct research on industry-related topics to generate ideas for new content.\n\nI edit and proofread content to ensure quality and accuracy. I collaborate with marketing and design teams to develop content strategies and ensure that our content aligns with our overall marketing goals.\n\nI stay informed about content marketing trends and best practices, continually improving my skills and knowledge. I strive to create content that engages our audience and drives traffic to our website.",
            chipList = listOf("SEO Writing", "Copywriting", "Content Strategy")
        ),
        BlogData(
            title = "Ethan Thomas",
            jobDescription = "Sales Representative",
            descriptionShort = "Sales Representative generating leads and closing deals.",
            description = "Sales Representative\n\nAs a Sales Representative, I prospect and generate leads through cold calling and networking. I present and demonstrate our products/services to potential customers, helping them to understan        the benefits and value of our offerings.\n\nI negotiate and close deals, working towards achieving and exceeding sales targets. I also build and maintain strong customer relationships, ensuring that our customers are satisfied with our products and services.\n\nI provide excellent customer service and support, addressing any issues or concerns that our customers may have. I strive to create a positive experience for our customers and build long-term relationships with them.",
            chipList = listOf("Lead Generation", "Sales Negotiation", "CRM")
        ),
        BlogData(
            title = "Isabella Adams",
            jobDescription = "UX/UI Designer",
            descriptionShort = "UX/UI Designer creating intuitive user interfaces.",
            description = "UX/UI Designer\n\nAs a UX/UI Designer, I create intuitive and visually appealing user interfaces for digital products. I conduct user research and usability testing to gather feedback and understand user needs.\n\nI collaborate with product managers and developers to implement my designs, ensuring that the final product meets user needs and provides a good user experience. I create wireframes, prototypes, and design mockups to visualize and communicate design ideas.\n\nI stay up-to-date with UX/UI design trends and best practices, continually improving my skills and knowledge. I strive to create designs that not only look good, but also provide a seamless and enjoyable user experience.",
            chipList = listOf("Sketch", "Figma", "User Research")
        ),
        BlogData(
            title = "David Turner",
            jobDescription = "Project Manager",
            descriptionShort = "Project Manager planning and monitoring projects.",
            description = "Project Manager\n\nAs a Project Manager, I plan, execute, and monitor projects to ensure they meet deadlines and budgets. I identify project requirements, resources, and risks, and develop plans to manage these elements.\n\nI coordinate with team members and stakeholders to ensure project success. I prepare and present project status reports to management, providing them with the information they need to make informed decisions about the project.\n\nI implement project management methodologies and tools to improve efficiency and effectiveness. I strive to deliver projects on time and within budget, ensuring that they meet the needs and expectations of our clients.",
            chipList = listOf("PMP", "Agile", "Risk Management")
        ),
        BlogData(
            title = "Sophia Hernandez",
            jobDescription = "Social Media Manager",
            descriptionShort = "Social Media Manager developing social media strategies.",
            description = "Social Media Manager\n\nAs a Social Media Manager, I develop and execute social media strategies to increase brand awareness and engagement. I create and curate engaging content for social media platforms, helping to build a strong online presence for our brand.\n\nI monitor our social media channels and respond to inquiries and comments, ensuring that our audience feels heard and valued. I analyze social media metrics and adjust our strategies accordingly to maximize our reach and engagement.\n\nI stay updated with social media trends and best practices, continually improving our social media strategy. I strive to create a strong and positive online presence for our brand, helping to drive traffic to our website and increase sales.",
            chipList = listOf("Facebook Ads", "Instagram Marketing", "Content Curation")
        ),
        BlogData(
            title = "Jackson Green",
            jobDescription = "Data Analyst",
            descriptionShort = "Data Analyst collecting and analyzing data for insights.",
            description = "Data Analyst\n\nAs a Data Analyst, I collect, clean, and analyze data to provide actionable insights. I develop data visualizations and reports for stakeholders, helping them to understand the data and make informed decisions.\n\nI collaborate with data engineers to ensure data quality and availability. I conduct statistical analysis and data modeling, helping to uncover patterns and trends in the data.\n\nI communicate data findings to non-technical audiences, helping them to understand the implications of the data. I strive to use data to drive improvements and innovations in the organization.",
            chipList = listOf("SQL", "Statistics")
        ),
        BlogData(
            title = "Scarlett Allen",
            jobDescription = "Customer Support Specialist",
            descriptionShort = "Customer Support Specialist assisting customers with product inquiries.",
            description = "Customer Support Specialist\n\nAs a Customer Support Specialist, I assist customers with product inquiries, issues, and troubleshooting. I respond to customer inquiries through various channels (email, phone, chat), providing timely and accurate information.\n\nI escalate complex issues to the appropriate departments, ensuring that our customers receive the help they need. I maintain customer databases and records, helping to improve our customer service and support.\n\nI provide excellent customer service to ensure customer satisfaction. I strive to create a positive experience for our customers and build long-term relationships with them.",
            chipList = listOf("Customer Service", "Problem Solving", "Communication")
        )
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = BlogAdapter(blogList = blogList)
        }
    }
}
