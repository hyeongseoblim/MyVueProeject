<template>
  <v-app id="inspire">
    <v-navigation-drawer
      v-model="drawer"
      app
      
    >
      <v-list dense>
        <v-list-item link>
          <v-list-item-action>
            <v-icon>mdi-home</v-icon>
          </v-list-item-action>
          <v-list-item-content>
            <v-list-item-title>Home</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
        <v-list-item link>
          <v-list-item-action>
            <v-icon>mdi-email</v-icon>
          </v-list-item-action>
          <v-list-item-content>
            <v-list-item-title>Contact</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </v-list>
    </v-navigation-drawer>

    <v-app-bar
      app
      dark
      class="bar"
    >
      <v-app-bar-nav-icon @click.stop="drawer = !drawer"></v-app-bar-nav-icon>
      <v-toolbar-title  >Application</v-toolbar-title>
    </v-app-bar>

    <v-main>
      <v-container
        class="fill-height"
        fluid
      >
        <v-carousel
          cycle
          height="400"
          hide-delimiter-background
          show-arrows-on-hover
        >
          <v-carousel-item
          v-for="(slide, i) in slides"
          :key="i">
            
              <v-row
                class="fill-height"
                align="center"
                justify="center">
                <div class="display-3">{{ slide }} Slide</div>
              </v-row>
            
          </v-carousel-item>
        </v-carousel>
      </v-container>
    </v-main>
    <v-footer
      app
      class="bar"
    >
      <span>&copy; {{ new Date().getFullYear() }}</span>
    </v-footer>
  </v-app>
</template>

<script>
  export default {
    props: {
      source: String,
    },
    data: () => ({
      drawer: null,
      slides:[
        "오늘은 뭐 입지? \n 오늘의 패션 정보를 여기서. \n 시작할 준비가 되셨나요?",
        '다른 사람들의 데일리룩을<br>바로 이곳에서<br>같이 보러갈 준비가 되셨나요?',
        '다양한 이벤트 정보와<br>리셀을 한곳에서<br>함께할 준비가 되셨나요?'
      ]
    }),
  }
</script>
<style>
  main{
    background-image : url('../assets/images/main05.png');
    background-repeat: no-repeat;
    background-size: cover;
  }
  .bar{
    opacity: 0.3;
  }
  

</style>