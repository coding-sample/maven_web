# templateプロジェクトの使い方
1. Webからリポジトリ新規作成。templateを指定
2. pom.xmlのmaven_webを変更（2か所）
3. pom.xmlのmaven_commonを変更（2か所）
4. settingsは引き継がれない
    1. Personal Access Token作成。read:packagesだけでOK
5. リポジトリ作成と同時にactionsが実行され、NGになっている。再実行

# templateプロジェクトの作り方
1. VSCからSpring Initializerで作成
2. setting.xmlを追加、pom.xmlにrepositoryを追加、workflow fileを追加
    1. commonのpackagesを取得
3. webから以下を設定
    1. Personal Access Token作成。read:packagesだけでOK
    2. このリポジトリにPATを追加。有効期限があるので注意

# Github Appsの作成
1. organizationアカウントに切り替え
2. settings-> Developper settings  -> Gihtub Apps -> New Github App
    1. URLは適当でよい
    2. WebhookのActiveはOFF
    3. Repository PermissionのPakcagesにread-onlyを付ける（Metadataも自動で付く）
    4. 作成。
        1. ページ末尾の「Private keys」を押下（ページ途中にもあるので注意）
        2. pemファイルがDLされる

# Github Appsのインストール
1. organizationのsettings -> Github Apps -> Appのアイコンをクリック
2. 左メニューのInstall App -> organizationを選択
3. リポジトリのsettings -> secrets and variables -> Secrets追加
    1. APP_ID=378486　※workflowの記述と合わせる
    2. PRIVATE_KEY=pemの中身　※workflowの記述と合わせる

# APIエンドポイント
- `GET /api/hello`: "Hello, World!"を返す

# 起動コマンド
以下のコマンドを使用してプロジェクトを起動します。
```
mvn spring-boot:run
```
