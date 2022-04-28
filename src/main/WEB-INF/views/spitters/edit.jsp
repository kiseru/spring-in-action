<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<div>
  <h2>Create a free Spitter account</h2>

  <sf:form method="post" modelAttribute="spitter">
    <fieldset>
      <table cellspacing="0">
        <tr>
          <th>
            <label for="user_full_name">Full name:</label>
          </th>

          <td>
            <sf:input path="fullName"
                      size="15"
                      id="user_full_name"/>
          </td>
        </tr>

        <tr>
          <th>
            <label for="user_screen_name">Username:</label>
          </th>

          <td>
            <sf:input path="username"
                      size="15"
                      maxlength="15"
                      id="user_screen_name"/>
          </td>
        </tr>

        <tr>
          <th>
            <label for="user_password">Password:</label>
          </th>

          <td>
            <sf:input path="password"
                      size="30"
                      showPassword="true"
                      id="user_password"/>
          </td>
        </tr>

        <tr>
          <th>
            <label for="user_email">Email Address:</label>
          </th>

          <td>
            <sf:input path="email"
                      size="30"
                      id="user_email"/>
          </td>
        </tr>

        <tr>
          <th></th>

          <td>
            <sf:checkbox path="updateByEmail"
                         id="user_send_email_newsletter"/>

            <label for="user_send_email_newsletter">Send me email updates</label>
          </td>
        </tr>
      </table>
    </fieldset>

    <button type="submit">Save</button>
  </sf:form>
</div>