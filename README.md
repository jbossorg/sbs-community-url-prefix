Jive SBS plugin providing additional URL prefix for communities
===============================================================

In addition to /community plugin provides /en prefix

Installation steps
------------------

1. Upload plugin via Jive SBS Admin console
2. Restart application
3. Optionally add this redirect rule to apache

        RewriteCond %{REQUEST_URI} !^/community-create.*
        $RewriteRule ^/community(.*) /en$1 [R=301,L]

