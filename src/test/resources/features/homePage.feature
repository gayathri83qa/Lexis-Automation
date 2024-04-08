Feature: Validate elements on the LexisNexis homepage

        Scenario: Verify elements under Transform Your Risk Decision Making heading
            Given I open the LexisNexis homepage
             Then the Financial Services link is present and clickable
              And the Insurance link is present and clickable
              And the Life and Pensions link is present and clickable
              And the Corporations and Non-Profits link is present and clickable

        Scenario: Verify selecting Financial Services industry
            Given I open the LexisNexis homepage
             When I select Financial Services under Choose your Industry tab
             Then Financial Crime Compliance link is present and clickable
              And Fraud and Identity Management link is present and clickable
              And Customer Data Management link is present and clickable
              And Credit Risk Assessment link is present and clickable
              And Collections & Recovery link is present and clickable
              And Tracing and Investigations link is present and clickable
