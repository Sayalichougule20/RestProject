import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AccountComponent } from './account/account.component';
import { AllComponent } from './all/all.component';
import { MusicComponent } from './music/music.component';
import { PodcastComponent } from './podcast/podcast.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { RegisterComponent } from './register/register.component';
import { ViewfeedbackComponent } from './viewfeedback/viewfeedback.component';
import { LoginComponent } from './login/login.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { ViewRegisterComponent } from './view-register/view-register.component';
import { ManagePlaylistComponent } from './manage-playlist/manage-playlist.component';
import { SongComponent } from './song/song.component';
import { InquiryComponent } from './inquiry/inquiry.component';
import { LikedLibComponent } from './liked-lib/liked-lib.component';
import { ArtistComponent } from './artist/artist.component';


export const routes: Routes = [
    {path:'',component:HomeComponent},
    {path:'account',component:AccountComponent},
    {path:'all',component:AllComponent},
    {path:'music',component:MusicComponent},
    {path:'podcast',component:PodcastComponent},
    {path:'feedback',component:FeedbackComponent},
    {path:'register',component:RegisterComponent},
    {path:'login',component:LoginComponent},
    {path:'adminlogin',component:AdminloginComponent},
    {path:'vfeedback',component:ViewfeedbackComponent},
    {path:'vreg',component:ViewRegisterComponent},
    {path:'mplaylist',component:ManagePlaylistComponent},
    {path:'song',component:SongComponent},
    {path:'inquiry',component:InquiryComponent},
    {path:'likedlib',component:LikedLibComponent},
    {path:'artist',component:ArtistComponent}
];
